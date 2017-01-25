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
import model.Automovil;
import model.Avion;
import model.Bicicleta;
import model.Motocicleta;
import model.Vehiculos;

/**
 *
 * @author macbookpro
 */
public class VehiculosDB {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/vehiculos";
    private static final String USER ="root";
    private static final String PASS="sisope05";
    
    public List<Vehiculos> getVehiculos(String valor) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
         ArrayList<Vehiculos> listaAutomovil = new ArrayList<Vehiculos>();
        if(valor.equals("automovil")){
        ResultSet resultado = consulta.executeQuery("Select a.idAutomovil,v.marca,v.color,v.modelo,a.idTipoVehiculo,a.tipoEncendido,a.tipoTraccion from vehiculo v inner join automovil a on v.idTipo = a.idTipoVehiculo");
        
        
        while(resultado.next()){
            Automovil automovil = new Automovil();
            /*int numaut = resultado.getInt("num_aut");
            String siglas = resultado.getString("siglas");
            int modelo = resultado.getInt("modelo");
            int capacidad = resultado.getInt("capacidad");
            String base = resultado.getString("base");*/
            
            automovil.setIdvehiculo(resultado.getInt("a.idAutomovil"));
            automovil.setIdTipoVehiculo(resultado.getString("a.idtipoVehiculo"));
            automovil.setMarca(resultado.getString("v.marca"));
            automovil.setModelo(resultado.getString("v.modelo"));
            automovil.setColor(resultado.getString("v.color"));
            automovil.setEncendidoElectronico(resultado.getString("a.tipoEncendido"));
            automovil.setTipoTraccion(resultado.getString("a.tipoTraccion"));
            
            
            listaAutomovil.add(automovil);
            
        
        }
        resultado.close();
        consulta.close();
        conexion.close();
        return listaAutomovil;
        }
        
        
        
        
       
        
        
        return listaAutomovil;
        
    
    }
    
    public boolean InsertaVehiculos(Object auto,String tipo) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        String queryVehiculo,queryAutomovil;
        
        if(tipo.equals("auto")){
        
        Automovil automovil = (Automovil)auto;
         queryVehiculo= String.format("insert into vehiculo(marca,color,modelo,idTipo) VALUES('%s','%s','%s','%s') ", 
                automovil.getMarca(),automovil.getColor(),automovil.getModelo(),automovil.getIdTipoVehiculo()
                );
         
         queryAutomovil= String.format("insert into automovil(idTipoVehiculo,tipoEncendido,tipoTraccion)VALUES('%s','%s','%s') ", 
                automovil.getIdTipoVehiculo(),automovil.getEncendidoElectronico(),automovil.getTipoTraccion()
                );
       int result =consulta.executeUpdate(queryVehiculo);
       int result2 =consulta.executeUpdate(queryAutomovil);
        consulta.close();
        conexion.close();
        if(result >0 && result2>0){
            return true;
        }
        
        }
        else if(tipo.equals("avion")){
        
        Avion avion = (Avion)auto;
         queryVehiculo= String.format("insert into vehiculo(marca,color,modelo,idTipo) VALUES('%s','%s','%s','%s') ", 
                avion.getMarca(),avion.getColor(),avion.getModelo(),avion.getIdTipoVehiculo()
                );
         
         queryAutomovil= String.format("insert into avion(idTipoVehiculo,tipoAvion,propulsores)VALUES('%s','%s','%s') ", 
                avion.getIdTipoVehiculo(),avion.getTipoAvion(),avion.getPropulsores()
                );
       int result =consulta.executeUpdate(queryVehiculo);
       int result2 =consulta.executeUpdate(queryAutomovil);
        consulta.close();
        conexion.close();
        if(result >0 && result2>0){
            return true;
        }
        
        }
        else if(tipo.equals("bici")){
        
        Bicicleta bici = (Bicicleta)auto;
         queryVehiculo= String.format("insert into vehiculo(marca,color,modelo,idTipo) VALUES('%s','%s','%s','%s') ", 
                bici.getMarca(),bici.getColor(),bici.getModelo(),bici.getIdTipoVehiculo()
                );
         
         queryAutomovil= String.format("insert into bicicleta(idTipoVehiculo,tipoBicicleta,tipoFrenos,Velocimetro)VALUES('%s','%s','%b','%b') ", 
                bici.getIdTipoVehiculo(),bici.getTipoBicicleta(),bici.getFrenosDisco(),bici.getVelocimetro()
                );
       int result =consulta.executeUpdate(queryVehiculo);
       int result2 =consulta.executeUpdate(queryAutomovil);
        consulta.close();
        conexion.close();
        if(result >0 && result2>0){
            return true;
        }
        
        }
        else if(tipo.equals("moto")){
        
        Motocicleta moto = (Motocicleta)auto;
          queryVehiculo= String.format("insert into vehiculo(marca,color,modelo,idTipo) VALUES('%s','%s','%s','%s') ", 
                moto.getMarca(),moto.getColor(),moto.getModelo(),moto.getIdTipoVehiculo()
                );
         
         queryAutomovil= String.format("insert into motocicleta(idTipoVehiculo,cascos,tipoMotocicleta,tipoEncendido)VALUES('%s','%s','%s','%s') ", 
                moto.getIdTipoVehiculo(),moto.getCascos(),moto.getTipoMotocicleta(),moto.getTipoEncendido()
                );
       int result =consulta.executeUpdate(queryVehiculo);
       int result2 =consulta.executeUpdate(queryAutomovil);
        consulta.close();
        conexion.close();
        if(result >0 && result2>0){
            return true;
        }
        
        }
        return false;
        
        
    }
}
