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
import modelo.Corrida;

/**
 *
 * @author ac.barrios
 */

public class CorridaBD {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/corridas";
    private static final String user = "root";
    private static final String pass = "sisope05";

    public static Boolean insertar(Corrida corrida) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String inserta = String.format("INSERT INTO corrida(origen, destino, fechaSalida, horaSalida, fechaLlegada, HoraLlegada, escalas) "
                + "VALUES ('%s','%s','%s','%s','%s','%s',%d)",
                corrida.getOrigen(), corrida.getDestino(), corrida.getFechaSalida().toString(),
                corrida.getHoraSalida().toString(), corrida.getFechaLlegada().toString(), 
                corrida.getHoraLlegada().toString(), corrida.getEscalas());
        int respuesta = consulta.executeUpdate(inserta);
        
        consulta.close();
        conexion.close();

        return respuesta == 1 ? true:false;
    }
 static public Corrida[] getCorridas(String fSalida,String hSalida,String fLlegada,String hLlegada)throws ClassNotFoundException,SQLException{
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String qry= String.format("select * from corrida where fechaSalida >= '%s' and horaSalida>='%s' and fechaLlegada<='%s' and horaLlegada<='%s' ",fSalida,hSalida,fLlegada,hLlegada);
        ResultSet resultado = consulta.executeQuery(qry);
        ArrayList<Corrida> lista = new ArrayList<Corrida>();
        
        while (resultado.next()){
            lista.add(new Corrida(
                    resultado.getString("origen"),
                    resultado.getString("destino"),
                    resultado.getString("fechaSalida"),
                    resultado.getString("horaSalida"),
                    resultado.getString("fechaLlegada"),
                    resultado.getString("horaLlegada"),
                    resultado.getInt("escalas")
            
            ));
                    
                    
                    
        
        
        
        }
        Corrida[] es = new Corrida[lista.size()];
        return lista.toArray(es);
    
    }
}
