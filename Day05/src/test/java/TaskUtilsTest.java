import junit.basic.performancetest.TaskUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class TaskUtilsTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS) // Fail if the test takes more than 10 seconds
    void testLongRunningTask() {
        String result = TaskUtils.longRunningTask();
        assertEquals("Task completed", result, "The task should return 'Task completed'.");
    }
}