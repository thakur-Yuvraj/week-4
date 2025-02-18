package annotation.exercise4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Create an instance of TaskManager
        TaskManager taskManager = new TaskManager();

        // Get the Class object for TaskManager
        Class<?> clazz = taskManager.getClass();

        // Iterate over all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method is annotated with @TaskInfo
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the @TaskInfo annotation
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Print the annotation details
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
                System.out.println();
            }
        }
    }
}