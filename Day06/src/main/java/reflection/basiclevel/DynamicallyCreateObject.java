package reflection.basiclevel;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber){ // Constructor to initialize Student object
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails(){ // Method to display student details
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
    }
}

public class DynamicallyCreateObject{
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("reflection.basiclevel.Student"); // Load the Student class
        Constructor<?> constructor = cls.getConstructor(String.class, int.class); // Get the constructor with String and int parameters
        Student student = (Student) constructor.newInstance("sanket", 143); // Create a new Student object dynamically
        student.displayDetails(); // Call the displayDetails method on the Student object
    }
}