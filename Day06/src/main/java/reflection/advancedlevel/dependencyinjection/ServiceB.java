package reflection.advancedlevel.dependencyinjection;

public class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void doSomething() {
        serviceA.doSomething();
        System.out.println("ServiceB is doing something.");
    }
}