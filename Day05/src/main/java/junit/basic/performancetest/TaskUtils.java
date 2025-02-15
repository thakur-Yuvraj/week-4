package junit.basic.performancetest;

public class TaskUtils {

    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task completed";
    }
}