/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author ac.barrios
 */
@ApplicationPath("")
public class HolaMundoApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public HolaMundoApplication() {
        singletons.add(new HolaMundoWS());
        singletons.add(new MensajeWs());
        singletons.add(new ArchivoWS());
    }
    
    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
