/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.corridas;

import bd.BDCorrida;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.owlike.genson.Genson;
import java.util.List;
import modelo.Corrida;

/**
 *
 * @author me.horta
 */
@Path("/")

public class WSCorridas {

    @GET
    @Path("consulta/{id}")
    public String consulta(@PathParam("id") int id) {
        try {
            Genson genson = new Genson();
            String json = genson.serialize(BDCorrida.BuscarCorrida(id));
            return json;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    @GET
    @Path("consultaTodo")
    public String consultaTodo() {
        try {
            Genson genson = new Genson();
            String json = genson.serialize(BDCorrida.getCorridas());
           // List<Corrida> corridas = genson.deserialize(json, List.class);
            return json;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null; 
    }
}
