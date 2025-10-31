
package payroll_system.service;

import payroll_system.dao.EmployeeDAO;
import payroll_system.model.Employee;
import java.util.List;
import java.util.Scanner;

public class PayrollService {
    
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private Scanner scanner = new Scanner (System.in);
    
    public void start(){
        
        //Switch Case for choices
        while(true){
            
            showMainMenu();
            System.out.print("CHOOSE AN OPTION: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> addEmployee();
                case 2 -> viewAllEmployees();
                case 3 -> updateEmployee();
                case 4 -> archiveEmployee();
                case 5 -> {
                    System.out.println("Exiting Program...");
                    return;
                }
                default -> System.out.println("Invalid option");
                
            }
        }
    }
    
    private void showMainMenu(){
        System.out.println("\n ==PAYROLL SYSTEM==");
        System.out.println("1.) Add Employee");
        System.out.println("2.) View All Employees");
        System.out.println("3.) Update an Employee's Informtaion");
        System.out.println("4.) Archive an Employee");
        System.out.println("5.) Exit");
        
    }
    
    private void addEmployee(){
        System.out.println("\n ----Add New Employee---- ");
        
        // Get the new Employee's name
        System.out.println("FULL NAME : ");
        String name = scanner.nextLine();
        
        //Get the new Employee's position
        System.out.println("POSITION : ");
        String position = scanner.nextLine();
        
        //Get the new Employee's rate per day
        System.out.println("DAILY RATE : ");
        double rate = scanner.nextDouble();
        
        //Get the new Employee's Residence Address
        System.out.println("ADDRESS: ");
        String address = scanner.nextLine();
        
        //Get the contact number of the Employee
        System.out.println("CONTACT NUMBER: ");
        String contact = scanner.nextLine();
        
        
        
    }
}
