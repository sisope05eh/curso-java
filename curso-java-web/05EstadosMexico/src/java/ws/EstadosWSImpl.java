/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.EstadoBD;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

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
    
}
