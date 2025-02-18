package annotation.exercise5;


class Software {
    @BugReport(description = "Null pointer exception occurs on invalid input.")
    @BugReport(description = "Performance issue when handling large data.")
    public void processData() {
        System.out.println("Processing data...");
    }
}
