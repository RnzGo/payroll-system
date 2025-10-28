/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll_system;  
import DatabaseConnection.java;  
import java.sql.Connection;  
import java.sql.SQLException;

public class Payroll_System {  
    public static void main(String[] args) {  
        System.out.println("=== Testing Database Connection ===");
        
        try {
            // Test the connection
            Connection conn = java.getConnection();  
            
            if (conn != null && !conn.isClosed()) {
                System.out.println("SUCCESS: Database connected successfully!");
                System.out.println("Connection details:");
                System.out.println(" - Database: " + conn.getMetaData().getDatabaseProductName());
                System.out.println(" - Version: " + conn.getMetaData().getDatabaseProductVersion());
                System.out.println(" - URL: " + conn.getMetaData().getURL());
                
                // Close connection
                conn.close();
                System.out.println("Connection closed properly.");
            }
            
        } catch (SQLException e) {
            System.err.println("ERROR: Database connection failed!");
            System.err.println("Error: " + e.getMessage());
        }
        
        System.out.println("=== Test completed ===");
    }
}
