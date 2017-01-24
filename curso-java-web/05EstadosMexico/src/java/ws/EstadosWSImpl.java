/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.EstadoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelo.Estado;

/**
 *
 * @author me.horta
 */
@WebService
public class EstadosWSImpl implements EstadosWs {
    
    @WebMethod
    @Override
    public String getCapital(@WebParam(name="estado")String s)throws ClassNotFoundException,SQLException{
        return EstadoBD.getCapital(s);
    }
    
    @WebMethod
    @Override
    public int getPoblacion(@WebParam(name="estado")String s)throws ClassNotFoundException,SQLException{
     return EstadoBD.getPoblacion(s);
    }
    
    

    @Override
    @WebMethod
    @WebResult(name="estado")
    public Estado[] getEstados() throws ClassCastException, SQLException {
        try {
            return EstadoBD.getEstados(); //To change body of generated methods, choose Tools | Templates.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
