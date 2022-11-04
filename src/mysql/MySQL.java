/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysql;

import java.sql.SQLException;

/**
 *
 * @author KAREN RAMIREZ
 */
public class MySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException  {
        conector io=new conector();
        io.conectorMysql();
    }
    
}
