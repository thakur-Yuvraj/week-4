package collection.setinterface.policymanagement;

public class Main {
    public static void main(String[] args) {
        // creating object of policy management system
        PolicyManagementSystem policyManagementSystem = new PolicyManagementSystem();

        // adding policies to system

        policyManagementSystem.addPolicy(new Policy(1, "ABC", 32, "Health", 16_000));
        policyManagementSystem.addPolicy(new Policy(2, "XYZ", 18, "Auto", 99_000));
        policyManagementSystem.addPolicy(new Policy(3, "PQR", 332, "Auto", 20_000));
        policyManagementSystem.addPolicy(new Policy(4, "ABC", 302, "Home", 1000));
        policyManagementSystem.addPolicy(new Policy(6, "STU", 320, "Home", 15_000));
        policyManagementSystem.addPolicy(new Policy(5, "VIJAY", 12, "Auto", 19_000));

        // printing the policy by exp date
        policyManagementSystem.displayPolicyByExpDate();

        // display all unique policy
        policyManagementSystem.displayAllPolicies();

        // printing the coverage type
        policyManagementSystem.displayCoverage("Home");
    }
}
