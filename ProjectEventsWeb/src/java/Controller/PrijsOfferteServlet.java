/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.zaal;
import EJB.ZaalEJB;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PrijsOfferteServlet", urlPatterns = {"/PrijsOfferteServlet"})
public class PrijsOfferteServlet extends HttpServlet {

    @EJB
    private ZaalEJB zaalEJB;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String prijsOff = request.getParameter("zaalId");

        List<zaal> alleZalen = zaalEJB.getAlleZalen();

        request.getSession().setAttribute("zalen", alleZalen);

        if (prijsOff != null) {
            try {

                long id = Long.parseLong(prijsOff);

                List<zaal> lstZalen = (List<zaal>) request.getSession().getAttribute("zalen");

                for (zaal z : lstZalen) {

                    if (z.getZaalid() == id) {

                        request.setAttribute("selectedZaal", z);
                    }
                }

                RequestDispatcher rd = request.getRequestDispatcher("succes.jsp");
                rd.forward(request, response);
            } catch (NumberFormatException | ServletException | IOException ex) {
                response.sendRedirect("succes.jsp");
            }
        } else {

            response.sendRedirect("succes.jsp");
        }
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
