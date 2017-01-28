/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;


import bd.CorridaBD;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelos.Corrida;
/**
 *
 * @author ac.barrios
 */
@Path("/")
public class CorridaWS {
    
    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida insertar(@FormParam("origen") String origen,
                            @FormParam("destino") String destino,
                            @FormParam("fechaSalida") String fechaSalida,
                            @FormParam("horaSalida") String horaSalida, 
                            @FormParam("fechaLlegada")String fechaLlegada,
                            @FormParam("horaLlegada")String horaLlegada,
                            @FormParam("escalas") int escalas){
        
        Corrida corrida = new Corrida(origen, destino, Date.valueOf(fechaSalida), Time.valueOf(horaSalida), 
                Date.valueOf(fechaLlegada), Time.valueOf(horaLlegada), escalas);
        
        
        
        try {
            CorridaBD.insertar(corrida);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return corrida;
    }
}
