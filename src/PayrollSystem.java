/*
import payroll_system.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class PayrollSystem {
    public static void main(String[] args) {
        System.out.println("=== Testing Database Connection ===");
        try {
            Connection conn = DatabaseConnection.getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("SUCCESS: Database connected successfully!");
                System.out.println(" - Database: " + conn.getMetaData().getDatabaseProductName());
                System.out.println(" - Version: " + conn.getMetaData().getDatabaseProductVersion());
                System.out.println(" - URL: " + conn.getMetaData().getURL());
                
                conn.close();
                System.out.println("Connection closed properly.");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Database connection failed!");
            e.printStackTrace();
        }
    }
}
*/

import payroll_system.service.PayrollService;

public class PayrollSystem{
    public static void main (String args []){
        PayrollService payrollService = new PayrollService();
        payrollService.start();
    }
}
