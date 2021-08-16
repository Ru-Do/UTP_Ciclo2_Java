package utp.misiontic2022.c2.p07.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p07.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
      // Su código
      ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
      //Generando conexion por medio del metodo para la base de datos
      Connection conexion = JDBCUtilities.getConnection(); 

      try{
        String consultar = "SELECT p.Fecha_Inicio, p.Constructora, p.Ciudad, " +
        "l.Nombre || \" \" || l.Segundo_Apellido AS \"Nombre Lider\", t.Codigo_Tipo, t.Estrato " +
        "FROM Proyecto p INNER JOIN Lider l ON (p.ID_Lider = l.ID_Lider) " +
        "INNER JOIN Tipo t ON (p.ID_Tipo = t.ID_Tipo)" + 
        "WHERE (p.Ciudad = \"Pereira\" AND p.Fecha_Inicio >= \"2019-09-01\" " +
        "AND p.Fecha_Inicio <= \"2019-09-09\")";
        PreparedStatement statement = conexion.prepareStatement(consultar);
        ResultSet resultSet = statement.executeQuery();

        // Recorriendo registros de VO
        while (resultSet.next()){
          Requerimiento_2 requerimiento_2 = new Requerimiento_2();
          requerimiento_2.setFecha(resultSet.getString("Fecha_Inicio"));
          requerimiento_2.setCiudad(resultSet.getString("Ciudad"));
          requerimiento_2.setConstructora(resultSet.getString("Constructora"));
          requerimiento_2.setNombreapellido(resultSet.getString("Nombre Lider"));
          requerimiento_2.setCodigotipo(resultSet.getInt("Codigo_Tipo"));
          requerimiento_2.setEstratotipo(resultSet.getInt("Estrato"));
          respuesta.add(requerimiento_2);
        }
        resultSet.close();
        statement.close();
      } catch (SQLException e){
        System.out.println("Error de consulta SQL Requerimiento 2 --->>>" + e);
      } finally{
        if (conexion != null){
          conexion.close();
        }
      }
      return respuesta;
    }  
    
}

