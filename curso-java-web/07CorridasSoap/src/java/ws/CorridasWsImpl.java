/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import db.CorridaBD;
import java.sql.SQLException;
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
        
        return CorridaBD.getCorridas(horaLle, horaLle, fechaLl, horaS);
        
               
      
    }
    
}
