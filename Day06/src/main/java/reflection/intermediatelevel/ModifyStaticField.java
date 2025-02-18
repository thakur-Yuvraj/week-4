package reflection.intermediatelevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "initial_key"; // Private static field

    // Public method to print the API_KEY (for verification)
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        // Print the initial value of API_KEY
        Configuration.printApiKey();

        // Get the Class object for Configuration
        Class<?> configClass = Configuration.class;

        // Get the private static field API_KEY
        Field apiKeyField = configClass.getDeclaredField("API_KEY");

        // Make the field accessible (since it's private)
        apiKeyField.setAccessible(true);

        // Modify the value of the static field
        apiKeyField.set(null, "new_key");

        // Print the updated value of API_KEY
        Configuration.printApiKey();
    }
}