package annotation.exercise4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Ensure the annotation is available at runtime
public @interface TaskInfo {
    int priority() default 1; // Default priority is 1
    String assignedTo() default "Unassigned"; // Default assignee is "Unassigned"
}