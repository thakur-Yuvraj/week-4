package reflection.advancedlevel.customobjectmappar;

import java.lang.reflect.Field;
import java.util.Map;

class Person {
    private String name;
    private int age;
    private String email;

    // Getters and setters

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", email=" + email + '}';

    }
}
public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over the map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();

                try {
                    // Get the field by name
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    // Set the field value
                    field.set(instance, value);
                } catch (NoSuchFieldException e) {
                    // Handle the case where the field does not exist
                    System.err.println("Field not found: " + fieldName);
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating object from map", e);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Object> properties = Map.of(
                "name", "Rohit Sharma",
                "age", 30,
                "email", "rohit.sharma@example.com"
        );

        Person person = toObject(Person.class, properties);
        System.out.println(person);
    }
}
