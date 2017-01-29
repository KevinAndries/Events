//    Author     : Andries Kevin

package Controller;

import DAL.zaal;
import DAL.afbeelding;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OverviewServlet", urlPatterns = {"/OverviewServlet"})
public class OverviewServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ZaaltmpId = request.getParameter("zaalId");       

        if (ZaaltmpId != null) {
            try {

                long id = Long.parseLong(ZaaltmpId);

                
                List<zaal> lstZalen = (List<zaal>) request.getSession().getAttribute("zalen");
                List<afbeelding> lstAfbeeldingen = (List<afbeelding>) request.getSession().getAttribute("afbeeldingen");

                ArrayList<afbeelding> responseafb = new ArrayList<afbeelding>();
                for (zaal z : lstZalen) {

                    if (z.getZaalid() == id) {

                        for (afbeelding a : lstAfbeeldingen) {

                            if (a.getZaalid().getZaalid() == id) {
                               
                                responseafb.add(a);
                            }
                        }
                        request.setAttribute("selectedZaal", z);
                    }
                }
                request.setAttribute("selectedAfbeelding", responseafb);
                
                RequestDispatcher rd = request.getRequestDispatcher("overview.jsp");
                rd.forward(request, response);
            } catch (NumberFormatException | ServletException | IOException ex) {
                response.sendRedirect("overview.jsp");
            }
        } else {
            
            response.sendRedirect("overview.jsp");
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
