/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.AutobusDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autobus;

/**
 *
 * @author me.horta
 */
@WebServlet(name = "ServletAutobus", urlPatterns = {"/autobus"})
public class ServletAutobus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAutobus</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAutobus at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
       
        
        AutobusDB aDB = new AutobusDB();
        List<Autobus> lista;
        try {
            lista = aDB.getAutobuses();
            PrintWriter pw = response.getWriter();
            lista.forEach(autobus -> pw.print(autobus));
            
            pw.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        
        request.setCharacterEncoding("UTF-8");
        Autobus autobusA= new Autobus();
        
        autobusA.setNumaut(Integer.parseInt(request.getParameter("num_aut")));
        autobusA.setSiglas(request.getParameter("siglas"));
        autobusA.setModelo(Integer.parseInt(request.getParameter("modelo")));
        autobusA.setCapacidad(Integer.parseInt(request.getParameter("capacidad")));
        autobusA.setBase(request.getParameter("base"));
        
        AutobusDB aDB = new AutobusDB();
        try {
            if(aDB.InsertaAutobus(autobusA)==true){
                response.sendRedirect("success.html");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
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

}
