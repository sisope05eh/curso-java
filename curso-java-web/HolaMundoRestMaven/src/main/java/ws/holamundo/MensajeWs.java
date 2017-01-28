/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author me.horta
 */
@Path("/mensaje")
public class MensajeWs {
    @Path("/{param}")
    @GET
    public Response imprimirMensaje(@PathParam("param") String param){
        String msj = "Tu mensaje es: " + param;
          if(param.length()>10){
             return Response.status(404).entity("el parametro no puede ser mayor a 10 caracteres").build();
             }else{
        return Response.status(200).entity(msj).build();
    }
    
    }
}
