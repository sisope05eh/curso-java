/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsholamundo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author me.horta
 */
@WebService
public interface HolaMundo {
 @WebMethod
public String getHolaMundo(String s); 
}
