package collection.mapinterface.insurancepolicymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // creating object of policy mgmt system
        InsurancePolicyManagementSystem policyManagementSystem = new InsurancePolicyManagementSystem();

        // adding new policies to system
        policyManagementSystem.addPolicy(new Policy(1, "ABC", 32, "Health", 16_000));
        policyManagementSystem.addPolicy(new Policy(2, "XYZ", 18, "Auto", 99_000));
        policyManagementSystem.addPolicy(new Policy(3, "PQR", 332, "Auto", 20_000));
        policyManagementSystem.addPolicy(new Policy(4, "ABC", 302, "Home", 1000));
        policyManagementSystem.addPolicy(new Policy(6, "STU", 320, "Home", 15_000));
        policyManagementSystem.addPolicy(new Policy(5, "VIJAY", 12, "Auto", 19_000));
        policyManagementSystem.addPolicy(new Policy(6, "AJAY", 0, "Auto", 19_000));

        // retrieving policy by its number
        System.out.println(policyManagementSystem.getPolicy(3));

        //Display all policies expiring within the next 30 days.
        policyManagementSystem.displayExpiringWithin30Days();

        //List all policies for a specific policyholder.
        policyManagementSystem.displayByPolicyHolder("ABC");

        //Remove policies that are expired.
        policyManagementSystem.removeExpiredPolicies();
    }
}
