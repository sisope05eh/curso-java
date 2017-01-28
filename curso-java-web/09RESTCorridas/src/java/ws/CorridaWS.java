/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

/**
 *
 * @author me.horta
 */
import bd.BDCorrida;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import modelo.Corrida;
/**
 *
 * @author ac.barrios
 */
@Path("/")
public class CorridaWS {
    @Path("Consulta/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida consulta(@PathParam("id")int id){
        try {
            return BDCorrida.BuscarCorrida(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida insertar(@QueryParam("origen") String origen,
                            @QueryParam("destino") String destino,
                            @QueryParam("fechaSalida") String fechaSalida,
                            @QueryParam("horaSalida") String horaSalida, 
                            @QueryParam("fechaLlegada")String fechaLlegada,
                            @QueryParam("horaLlegada")String horaLlegada,
                            @QueryParam("escalas") int escalas){
        
        Corrida corrida = new Corrida(origen, destino, fechaSalida, horaSalida, 
                fechaLlegada,horaLlegada, escalas);
        
        
        
        try {
            BDCorrida.insertar(corrida);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return corrida;
    }
}
