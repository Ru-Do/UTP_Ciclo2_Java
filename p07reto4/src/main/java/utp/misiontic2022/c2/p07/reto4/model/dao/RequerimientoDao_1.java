package utp.misiontic2022.c2.p07.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p07.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p07.reto4.util.JDBCUtilities;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
      // Su código
      ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
      //Generando conexion por medio del metodo para la base de datos
      Connection conexion = JDBCUtilities.getConnection(); 

      try{
        String consultar = "SELECT c.Fecha, c.ID_Compra, c.Proveedor, c.Pagado"
        + " FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 10";
        PreparedStatement statement = conexion.prepareStatement(consultar);
        ResultSet resultSet = statement.executeQuery();

        // Recorriendo registros de VO
        while (resultSet.next()){
          Requerimiento_1 requerimiento_1 = new Requerimiento_1();
          requerimiento_1.setFecha(resultSet.getString("Fecha"));
          requerimiento_1.setIdCompra(resultSet.getInt("ID_Compra"));
          requerimiento_1.setProveedor(resultSet.getString("Proveedor"));
          requerimiento_1.setPagado(resultSet.getString("Pagado"));
          respuesta.add(requerimiento_1);
        }
        resultSet.close();
        statement.close();
      } catch (SQLException e){
        System.out.println("Error de consulta SQL Requerimiento 1 --->>>" + e);
      } finally{
        if (conexion != null){
          conexion.close();
        }
      }

      return respuesta;
    }  
    
}
