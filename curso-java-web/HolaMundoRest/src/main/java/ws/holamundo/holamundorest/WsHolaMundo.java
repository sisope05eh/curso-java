/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo.holamundorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author me.horta
 */
@Path("holamundo")
public class WsHolaMundo {
    @GET
    public String HolaMundo(){
        return "Hola Mundo";
    }


}