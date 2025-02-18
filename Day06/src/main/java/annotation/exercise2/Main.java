package annotation.exercise2;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegacyAPI
        LegacyAPI api = new LegacyAPI();

        // Call the deprecated method (will show a warning)
        api.oldFeature();

        // Call the new method
        api.newFeature();
    }
}