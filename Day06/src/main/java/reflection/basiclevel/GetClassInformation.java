package reflection.basiclevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Employee{
    // attributes
    private String name;
    private int id;
    private double salary;

    //    Constructors
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee(){}

    // method to display details of employee
    private void displayDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}



public class GetClassInformation {
    public static void main(String[] args) throws Exception{
        Class<?> cls= Employee.class;

        Field [] fields = cls.getDeclaredFields(); // all fields of Employee class store in fields array

        Method method = cls.getDeclaredMethod("displayDetails"); // access method displayDetails

        Constructor <?> []constructors = cls.getConstructors(); // constructor or Employee class

        // print fields, method, and constructor
        System.out.println(Arrays.toString(fields));
        System.out.println(method);
        System.out.println(Arrays.toString(constructors));
    }
}
