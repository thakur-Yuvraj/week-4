package reflection.advancedlevel.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        DIContainer container = new DIContainer();

        // Register classes
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Inject dependencies
        container.injectDependencies();

        // Retrieve an instance and use it
        ServiceB serviceB = container.getInstance(ServiceB.class);
        serviceB.doSomething();
    }
}