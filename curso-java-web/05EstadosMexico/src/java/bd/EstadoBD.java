/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Estado;

/**
 *
 * @author me.horta
 */
public class EstadoBD {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/estadosmexico";
    private static final String USER ="root";
    private static final String PASS="sisope05";
    
    public static String getCapital(String nombreEstado) throws ClassNotFoundException, SQLException{
    
     Class.forName(JDBC_DRIVER);
        
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT capital FROM estados WHERE nombre ='"+nombreEstado+"'");
        
        String capital=null;
        
        if(resultado.next()){
            capital =(resultado.getString("capital"));
        }
       
        resultado.close();
        consulta.close();
        conexion.close();
        
        return capital;
        
    
    }
    
    public static int getPoblacion(String nombreEstado) throws ClassNotFoundException, SQLException{
    
     Class.forName(JDBC_DRIVER);
        
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT poblacion FROM estados WHERE nombre ='"+nombreEstado+"'");
        
        int poblacion=0;
        
        if(resultado.next()){
            poblacion =(resultado.getInt("poblacion"));
        }
       
        resultado.close();
        consulta.close();
        conexion.close();
        
        return poblacion;
        
    
    }
    
    static public Estado[] getEstados()throws ClassNotFoundException,SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM estados");
        ArrayList<Estado> lista = new ArrayList<Estado>();
        
        while (resultado.next()){
            lista.add(new Estado(
                    resultado.getInt("idEstado"),
                    resultado.getString("nombre"),
                    resultado.getInt("municipios"),
                    resultado.getString("capital"),
                    resultado.getString("comidaTipica"),
                    resultado.getInt("poblacion")
            
            ));
                    
                    
                    
        
        
        
        }
        Estado[] es = new Estado[lista.size()];
        return lista.toArray(es);
    
    }
    
    
}
