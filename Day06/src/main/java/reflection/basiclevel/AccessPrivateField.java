package reflection.basiclevel;

import java.lang.reflect.Field;

class Person {
    private int age = 10;
}


public class AccessPrivateField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // create object of person class
        Person person = new Person();

        // get class object
        Class<?> cls = person.getClass();

        Field field = cls.getDeclaredField("age"); // get private field age of person class

        field.setAccessible(true); // set access true

        System.out.println("Age before modification : "+field.get(person)); // print age before modification

        field.set(person,30); // modify age

        // print result after modification
        System.out.println("Age after modification : "+field.get(person));
    }
}
