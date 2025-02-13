package collection.mapinterface.groupobjectbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// GroupObjectByProperty class definition
public class GroupObjectByProperty {
    public static void main(String[] args) {
        // Department objects is created
        Department IT = new Department("IT");
        Department HR = new Department("HR");

        // List of the employees
        List<Employee> employees = new ArrayList<>();
        // Employee objects created
        Employee raj = new Employee("Raj", IT, 34000);
        Employee sanju = new Employee("Sanju", HR, 19000);
        Employee yuvi = new Employee("Yuvi", IT, 44000);
        Employee sandeep = new Employee("Sandeep", HR, 12000);
        Employee shiv = new Employee("Shiv", IT, 54000);

        // Employee object added to the list
        employees.add(raj);
        employees.add(sandeep);
        employees.add(sanju);
        employees.add(shiv);
        employees.add(yuvi);

        // HashMap declaration for storing department and corresponding list of employees
        HashMap<Department, List<Employee>> groupByDepartment = new HashMap<>();

        // Iterating the list and adding it to the hashmap
        for(int i=0; i<employees.size(); i++) {
            Employee employee = employees.get(i);
            List<Employee> names;

            if(groupByDepartment.containsKey(employee.department)) {
                names = groupByDepartment.get(employee.department);
                names.add(employee);
            } else {
                names = new ArrayList<>();
                names.add(employee);
                groupByDepartment.put(employee.department, names);
            }
        }

        // Iterating the map and printing the It and corresponding Employees names
        for(Map.Entry<Department, List<Employee>> entry : groupByDepartment.entrySet()) {
            System.out.print(entry.getKey().name + " -> {");

            List<Employee> employeesOfDepartment = entry.getValue();

            for(Employee employee : employeesOfDepartment) {
                System.out.print(employee.name + ", ");
            }

            System.out.println("}");
        }
    }
}

// Employee class definition
class Employee {
    public String name;
    public Department department;
    private double salary;

    Employee(String name, Department department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name is " + name +
                "Depatement name is " + department.name +
                " and salary is " + salary;
    }
}

// Department class definition
class Department {
    public String name;

    Department(String name) {
        this.name = name;
    }
}
