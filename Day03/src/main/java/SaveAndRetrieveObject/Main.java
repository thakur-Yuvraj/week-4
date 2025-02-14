package SaveAndRetrieveObject;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = EmployeeDataManagement.loadEmployees(); // Load existing data or create an empty list

        int choice;
        do {
            System.out.println("\nEmployee Management Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    EmployeeDataManagement.addEmployee(scanner, employees);
                    break;
                case 2:
                    EmployeeDataManagement.displayEmployees(employees);
                    break;
                case 3:
                    EmployeeDataManagement.saveEmployees(employees);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

}
