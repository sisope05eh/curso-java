/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Autobus;

/**
 *
 * @author me.horta
 */
public class AutobusDB {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER ="root";
    private static final String PASS="sisope05";
    
    
    public List<Autobus> getAutobuses() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM autobus");
        
        ArrayList<Autobus> lista = new ArrayList<Autobus>();
        
        while(resultado.next()){
            Autobus autobus = new Autobus();
            /*int numaut = resultado.getInt("num_aut");
            String siglas = resultado.getString("siglas");
            int modelo = resultado.getInt("modelo");
            int capacidad = resultado.getInt("capacidad");
            String base = resultado.getString("base");*/
            
            autobus.setNumaut(resultado.getInt("num_aut"));
            autobus.setSiglas(resultado.getString("siglas"));
            autobus.setModelo(resultado.getInt("modelo"));
            autobus.setCapacidad(resultado.getInt("capacidad"));
            autobus.setBase(resultado.getString("base"));
            
            lista.add(autobus);
            
        
        }
        resultado.close();
        consulta.close();
        conexion.close();
        
        return lista;
        
    
    }
    
    public boolean InsertaAutobus(Autobus autobus) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        
        Connection conexion1 = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta1 = conexion1.createStatement();
        String query = String.format("INSERT INTO autobus VALUES('%d','%s','%d','%d','%s') ", 
                autobus.getNumaut(),autobus.getSiglas(),autobus.getModelo(),autobus.getCapacidad(),autobus.getBase()
                );
       int result =consulta1.executeUpdate(query);
        consulta1.close();
        conexion1.close();
        if(result >0){
            return true;
        }
        return false;
        
      
        
        
        
        
    
    }
}
