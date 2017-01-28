/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import db.CorridaBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelo.Corrida;

/**
 *
 * @author me.horta
 */
@WebService
public class CorridasWsImpl implements CorridasWs{

    @Override
    @WebMethod
    @WebResult(name="corridas")
    public Corrida[] getCorridas(@WebParam(name="fsalida")String fechaS,@WebParam(name="hsalida") String horaS,@WebParam(name="fllegada") String fechaLl,@WebParam(name="hllegada") String horaLle) throws ClassNotFoundException, SQLException {
        
        return CorridaBD.getCorridas(fechaS, horaS, fechaLl, horaLle);
        
               
      
    }
    
    @WebMethod
    @WebResult(name="insertaCorridas")
    public boolean setCorridas(@WebParam(name="origen")String origen,@WebParam(name="destino") String destino,@WebParam(name="fsalida")String fechaS,@WebParam(name="hsalida") String horaS,@WebParam(name="fllegada") String fechaLl,@WebParam(name="hllegada") String horaLle,@WebParam(name="escalas") int escalas){
    
        try {
            return CorridaBD.insertar(origen,destino,fechaS,horaS,fechaLl,horaLle,escalas);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridasWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridasWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    @WebMethod
    @WebResult(name="eliminaCorridas")
    public boolean eliminaCorridas(@WebParam(name="idCorrida")int id) {
        try {
            return CorridaBD.eliminar(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridasWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridasWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
}
