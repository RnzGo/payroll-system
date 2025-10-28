/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class java{
    private static final String URL = "jdbc:mysql://localhost:3306/payroll_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected Successfully!");
            return conn;
        } 
        catch(ClassNotFoundException e){
            throw new SQLException ("MySQL Driver not found",e);
        }
        catch(SQLException e){
            throw new SQLException ("Database not found!",e);
        }
    }
}
