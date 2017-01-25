/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.VehiculosDB;
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
import model.Automovil;
import model.Vehiculos;

/**
 *
 * @author macbookpro
 */
@WebServlet(name = "ServletVehiculos", urlPatterns = {"/consultaVehiculo"})
public class ServletVehiculos extends HttpServlet {

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
            out.println("<title>Servlet ServletVehiculos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletVehiculos at " + request.getContextPath() + "</h1>");
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
        String action = request.getParameter("action");

        if ("consular".equals(action)) {
            // Invoke FirstServlet's job here.
            
             VehiculosDB aDB = new VehiculosDB();
        String valor = request.getParameter("tipo");
        if(valor.equals("automovil")){
         try {
           List<Vehiculos> lista;
             
            lista = aDB.getVehiculos(valor);            
            PrintWriter pw = response.getWriter();
            lista.forEach(auto -> pw.print(auto));
            
            pw.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        } else if ("registrar".equals(action)) {
            String valor = request.getParameter("tipo");
            if(valor.equals("automovil")){
             response.sendRedirect("registraAuto.html");
            }
            if(valor.equals("avion")){
             response.sendRedirect("registraAvion.html");
            }
            if(valor.equals("bici")){
             response.sendRedirect("registraBici.html");
            }
             if(valor.equals("moto")){
             response.sendRedirect("registraMoto.html");
            }
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
