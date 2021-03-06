/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

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
public interface CorridasWs {
   
    
    @WebMethod
    public Corrida[] getCorridas(String fechaS,String horaS,String fechaLl,String horaLle)throws ClassNotFoundException,SQLException;
    
    @WebMethod
    public boolean setCorridas(String origen,String destino,String fechaS,String horaS,String fechaLl,String horaLle,int escalas);

    @WebMethod
    public boolean eliminaCorridas(int id);

}
