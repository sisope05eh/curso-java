/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

/**
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author me.horta
 */

public class BDCorrida {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/corridas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "sisope05";

    
 public static Corrida BuscarCorrida(int id) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl,user,pass);
        Statement st = conexion.createStatement();
        String consulta = String.format("select * from corrida where idCorrida = %d",id);
        ResultSet rs = st.executeQuery(consulta);
        Corrida corrida = new Corrida();

        if (rs.next()){
            corrida.setOrigen(rs.getString("origen"));
            corrida.setDestino(rs.getString("destino"));
            corrida.setFechaSalida(rs.getString("fechaSalida"));
            corrida.setFechaLlegada(rs.getString("fechaLlegada"));
            corrida.setHoraSalida(rs.getString("horaSalida"));
            corrida.setHoraLlegada(rs.getString("horaLlegada"));
            corrida.setEscalas(rs.getInt("escalas"));
        }

        rs.close();
        st.close();
        conexion.close();
        return corrida;
    }

  public static Corrida[] getCorridas() throws ClassNotFoundException, SQLException{
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM corrida");
        ArrayList<Corrida> lista = new ArrayList<Corrida>();
        
        while (resultado.next()) {
            lista.add(new Corrida(
                resultado.getString("origen"),
                resultado.getString("destino"),
                resultado.getString("fechaSalida"),
                resultado.getString("fechaLlegada"),
                resultado.getString("horaSalida"),
                resultado.getString("horaLlegada"),
                resultado.getInt("escalas")
              ));
        }
        resultado.close();
        consulta.close();
        conexion.close();
        Corrida[] es = new Corrida[lista.size()];
        
        return  lista.toArray(es);
    }
}
