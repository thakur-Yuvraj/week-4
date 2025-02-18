package annotation.exercise4;

public class TaskManager {

    @TaskInfo(priority = 2, assignedTo = "Alice")
    public void performTask() {
        System.out.println("Task is being performed...");
    }

    @TaskInfo(priority = 3, assignedTo = "Bob")
    public void reviewTask() {
        System.out.println("Task is being reviewed...");
    }

    public void unannotatedMethod() {
        System.out.println("This method is not annotated with @TaskInfo.");
    }
}