/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.zaal;
import DAL.afbeelding;
import Dao.ZaalDaoLocal;
import EJB.ZaalEJB;
import EJB.AfbeeldingEJB;
import ViewModel.Zaal;
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

@WebServlet(name = "AanvraagPrijsOfferteServlet", urlPatterns = {"/AanvraagPrijsOfferteServlet"})
public class AanvraagPrijsOfferteServlet extends HttpServlet {

    @EJB
    //private ZaalDaoLocal zaalDao;
    private ZaalEJB zaalEJB;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String aanvraagPrijsOff = request.getParameter("zaalId");

        List<zaal> alleZalen = zaalEJB.getAlleZalen();

        request.getSession().setAttribute("zalen", alleZalen);

        if (aanvraagPrijsOff != null) {
            try {

                long id = Long.parseLong(aanvraagPrijsOff);

                //Map mapZalen = new HashMap();
                List<zaal> lstZalen = (List<zaal>) request.getSession().getAttribute("zalen");

        
                for (zaal z : lstZalen) {

                    if (z.getZaalid() == id) {

                        request.setAttribute("selectedZaal", z);
                    }
                }

                RequestDispatcher rd = request.getRequestDispatcher("prijsOfferte.jsp");
                rd.forward(request, response);
            } catch (NumberFormatException | ServletException | IOException ex) {
                response.sendRedirect("prijsOfferte.jsp");
            }
        } else {

            response.sendRedirect("prijsOfferte.jsp");
        }
//
//        if (aanvraagPrijsOff != null && aanvraagPrijsOff.equals("conf")) {
//            //response.sendRedirect("PrijsOfferte.jsp");
//            RequestDispatcher rd = request.getRequestDispatcher("prijsOfferte.jsp");
//            rd.forward(request, response);
//
//        }

//        RequestDispatcher rd = request.getRequestDispatcher("succes.jsp");
//        rd.forward(request, response);
        //request.setAttribute("zaal", zaal);
        //request.setAttribute("alleZalen", zaalDao.getAllZalen());
        //request.getRequestDispatcher("index.jsp").forward(request, response);
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
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
