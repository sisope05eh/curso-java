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
@WebServlet(name = "ServletInsertar", urlPatterns = {"/InsertaVehiculo"})
public class ServletInsertar extends HttpServlet {

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
        
         String action = request.getParameter("action");
         
         if ("Registrar Auto".equals(action)) {
            // Invoke FirstServlet's job here.
            request.setCharacterEncoding("UTF-8");
            Automovil auto= new Automovil();
        
            auto.setIdTipoVehiculo(request.getParameter("idTipo"));
            auto.setMarca(request.getParameter("marca"));
            auto.setColor(request.getParameter("color"));
            auto.setModelo(request.getParameter("modelo"));
            auto.setEncendidoElectronico(request.getParameter("tipoEn"));
            auto.setTipoTraccion(request.getParameter("tipoTr"));
            VehiculosDB aDB = new VehiculosDB();

            try {
                if(aDB.InsertaVehiculos(auto,"auto")==true){
                    response.sendRedirect("Principal.html");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServletInsertar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ServletInsertar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
         
         /*else if ("registrar".equals(action)) {
            String valor = request.getParameter("tipo");
            if(valor.equals("automovil")){
             response.sendRedirect("registrar.html");
            }
        }*/    
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