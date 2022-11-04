/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.sql.Statement;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author KAREN RAMIREZ
 */
public class conector {
    public void conectorMysql() throws SQLException {
        try{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Establecemos la conexión con la base de datos.
        Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
        // Preparamos la consulta
        Statement s = (Statement) conexion.createStatement();
        ResultSet rs = (ResultSet) s.executeQuery("select * from persona");
        // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDate(3));
        }
        // Cerramos la conexion a la base de datos.
        conexion.close();
        }catch (SQLException ex) {
            Logger.getLogger(Conectarbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
