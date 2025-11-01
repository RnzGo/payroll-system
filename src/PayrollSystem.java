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

/*
import payroll_system.dao.EmployeeDAO;
import payroll_system.model.Employee;

public class PayrollSystem {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        
        // Test adding employee
        Employee emp = new Employee();
        emp.setEmpName("Juan Dela Cruz");
        emp.setEmpPosition("Software Developer");
        emp.setRatePerDay(1500.00);
        emp.setEmpAddress("Manila");
        emp.setContactNumber("09123456789");
        
        boolean success = employeeDAO.addEmployee(emp);
        System.out.println("Employee added: " + success);
        
        // Test retrieving employees
        System.out.println("\nAll Employees:");
        employeeDAO.getAllEmployees().forEach(e -> {
            System.out.println(e.getEmpName() + " - " + e.getEmpPosition());
        });
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
