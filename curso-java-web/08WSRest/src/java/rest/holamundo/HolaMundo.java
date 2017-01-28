/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author me.horta
 */
@Path("/HolaMundo")
public class HolaMundo {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String HolaMundoText(){
        return "Hola Mundo";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    public String HolaMundoXML(){
            return "<? xml version=\"1.0\"><hola>hola mundo </hola>";
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String HolaMundoHTML(){
        return "<html> <body><p>Hola mundo</p></body></html>";
    }
    
}
