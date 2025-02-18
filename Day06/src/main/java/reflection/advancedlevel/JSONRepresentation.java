package reflection.advancedlevel;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;
    private int age;
    private String email;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class JSONRepresentation {

    public static String toJson(Object obj) {
        try {
            // Get the class of the object
            Class<?> clazz = obj.getClass();

            // Create a map to hold field names and values
            Map<String, Object> fieldMap = new HashMap<>();

            // Get all declared fields
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                fieldMap.put(field.getName(), value);
            }

            // Convert the map to a JSON-like string
            return mapToJson(fieldMap);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    private static String mapToJson(Map<String, Object> map) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        int size = map.size();
        int index = 0;

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            jsonBuilder.append("\"")
                    .append(entry.getKey())
                    .append("\": ");

            Object value = entry.getValue();
            if (value instanceof String) {
                jsonBuilder.append("\"")
                        .append(value)
                        .append("\"");
            } else {
                jsonBuilder.append(value);
            }

            if (index < size - 1) {
                jsonBuilder.append(", ");
            }
            index++;
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Virat Kohli");
        person.setAge(30);
        person.setEmail("virat.kohli@example.com");

        String json = toJson(person);
        System.out.println(json);
    }
}



