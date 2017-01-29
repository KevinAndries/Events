//    Author     : Andries Kevin

package Controller;

import EJB.ZaalEJB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

    @EJB
    private ZaalEJB zaalEJB;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
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


            String naam = request.getParameter("naam");
            String adres = request.getParameter("adres");
            String gemeente = request.getParameter("gemeente");
            String postcode = request.getParameter("postcode");
            String capaciteit = request.getParameter("capaciteit");
            String tarieven = request.getParameter("tarieven");

            ArrayList al = null;
            ArrayList zaalid_list = new ArrayList();

            String query = "select * from zaal";

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


    @Override
    public String getServletInfo() {
        return "Short description";
    }
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
