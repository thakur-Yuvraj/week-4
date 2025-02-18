package reflection.advancedlevel;

import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Timed {
}

class ExampleClass {

    @Timed
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    @Timed
    public void slowMethod() throws InterruptedException {
        System.out.println("Executing slowMethod...");
        Thread.sleep(1000); // Simulate a slow operation
    }

    public void ignoredMethod() {
        System.out.println("This method is not timed.");
    }
}

public class MethodTimer {
    public static void measureExecutionTime(Object target) {
        Class<?> clazz = target.getClass();

        // Iterate over all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method is annotated with @Timed
            if (method.isAnnotationPresent(Timed.class)) {
                method.setAccessible(true); // Allow access to private methods
                long startTime = System.nanoTime();

                try {
                    // Invoke the method on the target object
                    method.invoke(target);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to invoke method: " + method.getName(), e);
                }

                long endTime = System.nanoTime();
                long duration = endTime - startTime;

                System.out.println("Method '" + method.getName() + "' took " + duration + " nanoseconds.");
            }
        }
    }
}


class Main {
    public static void main(String[] args) throws InterruptedException {
        ExampleClass example = new ExampleClass();

        // Measure execution time of methods annotated with @Timed
        MethodTimer.measureExecutionTime(example);
    }
}