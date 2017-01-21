/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author me.horta
 */
@WebService
public interface EstadosWs {
    @WebMethod
    public String getCapital(String s) throws ClassNotFoundException,SQLException;
    
    @WebMethod
    public int getPoblacion(String s)throws ClassNotFoundException,SQLException;
    
}
