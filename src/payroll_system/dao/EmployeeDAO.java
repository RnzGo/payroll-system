package payroll_system.dao;

import payroll_system.model.Employee;
import payroll_system.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
  
public class EmployeeDAO {
    
    public boolean addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (emp_name, emp_position, rate_per_day, emp_address, contact_number, emp_status) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, employee.getEmpName());
            pstmt.setString(2, employee.getEmpPosition());
            pstmt.setDouble(3, employee.getRatePerDay());
            pstmt.setString(4, employee.getEmpAddress());
            pstmt.setString(5, employee.getContactNumber());
            pstmt.setString(6, "Active");
            
            return pstmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees WHERE emp_status = 'Active'";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpId(rs.getInt("emp_id"));
                emp.setEmpName(rs.getString("emp_name"));
                emp.setEmpPosition(rs.getString("emp_position"));
                emp.setRatePerDay(rs.getDouble("rate_per_day"));
                emp.setEmpAddress(rs.getString("emp_address"));
                emp.setContactNumber(rs.getString("contact_number"));
                emp.setEmpStatus(rs.getString("emp_status"));
                
                employees.add(emp);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
        
    

