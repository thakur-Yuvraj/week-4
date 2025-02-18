package reflection.advancedlevel.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Implement the actual interface
class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye, " + name + "!";
    }
}

// Create the InvocationHandler
class LoggingInvocationHandler implements InvocationHandler {
    private final Object target; // The actual implementation

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name
        System.out.println("Calling method: " + method.getName());

        // Delegate the call to the actual implementation
        return method.invoke(target, args);
    }
}

public class LoggingProxy {
    public static void main(String[] args) {
        // Create the actual implementation
        Greeting greeting = new GreetingImpl();

        // Create the proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingInvocationHandler(greeting)
        );

        // Call methods on the proxy
        System.out.println(proxy.sayHello("Rohan"));
        System.out.println(proxy.sayGoodbye("Bobby"));
    }
}
