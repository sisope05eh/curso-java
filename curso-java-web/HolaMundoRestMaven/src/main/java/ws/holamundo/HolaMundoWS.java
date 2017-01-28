/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author ac.barrios
 */
@Path("HolaMundo")
public class HolaMundoWS {
    @GET
    public String holaMundo(){
        return "Hola Mundo";
    } 
}
