/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.corridas;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 *
 * @author me.horta
 */
@ApplicationPath("")
public class CorridasApplication extends Application{
     private Set<Object> singletons = new HashSet<Object>();

    public CorridasApplication() {
        singletons.add(new WSCorridas());
        
    }
    
    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
