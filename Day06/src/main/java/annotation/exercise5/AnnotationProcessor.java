package annotation.exercise5;


import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("processData");

        // Check if BugReports annotation is present
        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports reports = method.getAnnotation(BugReports.class);
            for (BugReport report : reports.value()) {
                System.out.println("Bug: " + report.description());
            }
        }

        // Alternative way to retrieve annotations individually
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
        for (BugReport report : bugReports) {
            System.out.println("Bug (Alternative): " + report.description());
        }
    }
}
