/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.zaal;
import EJB.ZaalEJB;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.text.Utilities;

@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

    @EJB
    //private ZaalDaoLocal zaalDao;
    private ZaalEJB zaalEJB;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3307/";
        String dbName = "db_zalen";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "usbw";

        Statement st;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected!");

            String zaalId = request.getParameter("zaalId");
            String naam = request.getParameter("naam");
            String adres = request.getParameter("adres");
            String gemeente = request.getParameter("gemeente");
            String postcode = request.getParameter("postcode");
            String capaciteit = request.getParameter("capaciteit");
            String tarieven = request.getParameter("tarieven");

            ArrayList al = null;
            ArrayList zaalid_list = new ArrayList();

            String query = "select * from zaal";

//            if (zaalId != null && !zaalId.equals("")) {
//                query = "select * from zaal where zaalId like '%" + zaalId + "%'";
//            } else 
                if (naam != null && !naam.equals("")) {
                query = "select * from zaal where naam like '%" + naam + "%'";
            } else if (adres != null && !adres.equals("")) {
                query = "select * from zaal where adres like '%" + adres + "%'";
            } else if (gemeente != null && !gemeente.equals("")) {
                query = "select * from zaal where gemeente  like'%" + gemeente + "%'";
            } else if (postcode != null && !postcode.equals("")) {
                query = "select * from zaal where postcode like '%" + postcode + "%'";
            }else if (capaciteit != null && !capaciteit.equals("")) {
               query = "select * from zaal where capzittend < '" + capaciteit + "' and capstaand < '" + capaciteit + "'";
            }else if (tarieven != null && !tarieven.equals("")) {
                query = "select * from zaal where tarieven < '" + tarieven + "'";
            }

            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                al = new ArrayList();

                al.add(rs.getInt(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getInt(4));
                al.add(rs.getString(5));
                al.add(rs.getInt(6));
                al.add(rs.getString(7));
                al.add(rs.getString(8));
                al.add(rs.getString(9));
                al.add(rs.getDouble(10));
                al.add(rs.getInt(11));
                al.add(rs.getInt(12));
                al.add(rs.getInt(13));

                System.out.println("al :: " + al);
                zaalid_list.add(al);
            }

            request.setAttribute("ziList", zaalid_list);
            RequestDispatcher view = request.getRequestDispatcher("searchResult.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     * 
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

//        String action = request.getParameter("action");
//        String zaalIdStr = request.getParameter("zaalId");
//        //int zaalId = zaalIdStr.equals("") ? 0 : Integer.parseInt(zaalIdStr);
//        int zaalId = 0;
//        if (zaalIdStr != null && !zaalIdStr.equals("")) {
//            zaalId = Integer.parseInt(zaalIdStr);
//        }
//
//        String naam = request.getParameter("naam");
//        String huisnummerStr = request.getParameter("huisnummer");
//        //int huisnummer = huisnummerStr.equals("") ? 0 : Integer.parseInt(huisnummerStr);
//        int huisnummer = 0;
//        if (huisnummerStr != null && !huisnummerStr.equals("")) {
//            huisnummer = Integer.parseInt(huisnummerStr);
//        }
//
//        String gemeente = request.getParameter("gemeente");
//        String postcodeStr = request.getParameter("postcode");
//        //int postcode = postcodeStr.equals("") ? 0 : Integer.parseInt(postcodeStr);
//        int postcode = 0;
//        if (postcodeStr != null && !postcodeStr.equals("")) {
//            postcode = Integer.parseInt(postcodeStr);
//        }
//
//        String email = request.getParameter("email");
//        String kenmerken = request.getParameter("kenmerken");
//        String faciliteiten = request.getParameter("faciliteiten");
//        String tarievenStr = request.getParameter("tarieven");
//        //double tarieven = tarievenStr.equals("") ? 0 : Integer.parseInt(tarievenStr);
//        double tarieven = 0;
//        if (tarievenStr != null && !tarievenStr.equals("")) {
//            tarieven = Double.parseDouble(tarievenStr);
//        }
//        String capZittendStr = request.getParameter("capaciteit zittend");
//        int capZittend = 0;
//        if (capZittendStr != null && !capZittendStr.equals("")) {
//            capZittend = Integer.parseInt(capZittendStr);
//        }
//        String capStaandStr = request.getParameter("capaciteit staand");
//        int capStaand = 0;
//        if (capStaandStr != null && !capStaandStr.equals("")) {
//            capStaand = Integer.parseInt(capStaandStr);
//        }
//        String oppervlakteStr = request.getParameter("oppervlakte");
//        int oppervlakte = 0;
//        if (oppervlakteStr != null && !oppervlakteStr.equals("")) {
//            oppervlakte = Integer.parseInt(oppervlakteStr);
//        }
//
//List<zaal> alleZalen = zaalEJB.getAlleZalen();
//        
//        request.getSession().setAttribute("zalen", alleZalen);
//        
//        RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
//        rd.forward(request, response);
//        
    //request.setAttribute("zaal", zaal);
    //request.setAttribute("alleZalen", zaalDao.getAllZalen());
    //request.getRequestDispatcher("index.jsp").forward(request, response);
//            @EJB
//    private ZaalDaoLocal zaalDao;
//    private ZaalEJB zaalEJB;
//    private AfbeeldingEJB afbeeldingEJB;
//                Zaal zaal = new Zaal(zaalId, naam, email, huisnummer, gemeente, postcode, email, kenmerken, faciliteiten, tarieven, capZittend, capStaand, oppervlakte); //, profiel);
//
//        if ("Toevoegen".equalsIgnoreCase(action)) {
//            zaalDao.toevoegenZaal(zaal);
//
//        } else if ("Wijzigen".equalsIgnoreCase(action)) {
//            zaalDao.wijzigenZaal(zaal);
//
//        } else if ("Verwijderen".equalsIgnoreCase(action)) {
//            zaalDao.verwijderenZaal(zaalId);
//
//        } else if ("Zoeken".equalsIgnoreCase(action)) {
//            zaal = zaalDao.getZaal(zaalId);
//        }
//        
    // }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
//    @Override
//        public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
}
