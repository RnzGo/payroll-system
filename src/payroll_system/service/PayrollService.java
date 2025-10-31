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
            int choice = getIntInput("\nCHOOSE AN OPTION: ");
            
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
        System.out.print("FULL NAME : ");
        String name = scanner.nextLine();
        
        //Get the new Employee's position
        System.out.print("POSITION : ");
        String position = scanner.nextLine();
        
        //Get the new Employee's rate per day
        double rate = getDoubleInput("RATE PER DAY: ");
        
        //Get the new Employee's Residence Address
        System.out.print("ADDRESS: ");
        String address = scanner.nextLine();
        
        //Get the contact number of the Employee
        System.out.print("CONTACT NUMBER: ");
        String contact = scanner.nextLine();
        
        Employee employee = new Employee();
        
        employee.setEmpName(name);
        employee.setEmpPosition(position);
        employee.setRatePerDay(rate);
        employee.setEmpAddress(address);
        employee.setContactNumber(contact);
        employee.setEmpStatus("Active");
        
        boolean success = employeeDAO.addEmployee(employee);
        System.out.println(success? "Employee successfully added!":"Failed to add employee!");
        
    }
    
    private void viewAllEmployees(){
        System.out.println("\n----VIEW ALL EMPLOYEES----");
        List<Employee> employees = employeeDAO.getAllEmployees();
        
        if (employees.isEmpty()){
            System.out.println("No Employees Found!");
            return;
        }
        
        System.out.println("\nID || NAME || POSITION || RATE PER DAY || STATUS");
        System.out.println("------------------------------------------------");
        for (Employee emp : employees){
            System.out.printf("\n%d | %s | %s | ₱%.2f | %s\\n",
                    emp.getEmpId(),
                    emp.getEmpName(),
                    emp.getEmpPosition(),
                    emp.getRatePerDay(),
                    emp.getEmpStatus());
        }
    }
    
    private void updateEmployee(){
        System.out.println("Update feature on work... Please Standby");
    }
    
    private void archiveEmployee(){
        System.out.println("Archiving an Employee on work... Please Standby");
    }
    
    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    
    private double getDoubleInput(String prompt){
        System.out.print(prompt);
        while (!scanner.hasNextDouble()){
            System.out.println("Please Enter A Valid Amount: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
