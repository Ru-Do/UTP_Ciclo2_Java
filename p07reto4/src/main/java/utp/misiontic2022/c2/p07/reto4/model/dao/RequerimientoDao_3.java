package utp.misiontic2022.c2.p07.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.p07.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
      // Su código
      ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
      //Generando conexion por medio del metodo para la base de datos
      Connection conexion = JDBCUtilities.getConnection(); 

      try{
        String consultar = "SELECT  SUBSTR(l.Nombre,1,3 ) || " +
        "SUBSTR(l.Primer_Apellido,1,3) || SUBSTR(l.Segundo_Apellido,1,3 ) " +
        "AS \"Abrev\" FROM Lider l";
        PreparedStatement statement = conexion.prepareStatement(consultar);
        ResultSet resultSet = statement.executeQuery();

        // Recorriendo registros de VO
        while (resultSet.next()){
          Requerimiento_3 requerimiento_3 = new Requerimiento_3();
          requerimiento_3.setAbrev(resultSet.getString("Abrev"));
          respuesta.add(requerimiento_3);
        }
        resultSet.close();
        statement.close();
      } catch (SQLException e){
        System.out.println("Error de consulta SQL Requerimiento 3 --->>>" + e);
      } finally{
        if (conexion != null){
          conexion.close();
        }
      }

      return respuesta;
    }  
    
}

