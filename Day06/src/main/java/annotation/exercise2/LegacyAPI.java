package annotation.exercise2;

class LegacyAPI {
    // Mark the old method as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature. It is deprecated and should not be used.");
    }

    // New method to replace the old one
    public void newFeature() {
        System.out.println("This is the new feature. Use this instead.");
    }
}