
//Each policy has the following attributes:
//● Policy Number (unique identifier)
//● Policyholder Name
//● Expiry Date
//● Coverage Type (e.g., Health, Auto, Home)
//● Premium Amount
//
//Requirements:
//        1. Store Unique Policies: Implement methods to store policies using different
//types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
//purposes:
//HashSet for quick lookups.
//LinkedHashSet to maintain the order of insertion.
//TreeSet to maintain policies sorted by expiry date.
//
//        2. Retrieve Policies: Implement methods to retrieve and display policies based on
//certain criteria:
//All unique policies.
//Policies expiring soon (within the next 30 days
//                                Policies with a specific coverage type.
//                                Duplicate policies based on policy numbers.
//
//                                3. Performance Comparison: Compare the performance of HashSet,
//                        LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
//                                policies.



package collection.setinterface.policymanagement;

import java.util.*;

public class PolicyManagementSystem {
    // hash set for quick lookup
    private HashSet<Policy> lookup;

    // linked hash set to maintain order
    private Set<Policy> order;

    //TreeSet to maintain policies sorted by expiry date.
    private NavigableSet<Policy> expDate;

    // constructor
    PolicyManagementSystem() {
        lookup = new HashSet<>();
        order = new LinkedHashSet<>();
        expDate = new TreeSet<>();
    }

    // adding policy into the storage
    public void addPolicy(Policy policy) {
        lookup.add(policy);
        order.add(policy);
        expDate.add(policy);
    }

    //display All unique policies.
    public void displayAllPolicies() {
        System.out.println(lookup);
    }

    // display policy sorted by date
    public void displayPolicyByExpDate() {
        System.out.println(expDate);
    }

    // displaying policy type based on coverage type
    public void displayCoverage(String coverageType) {
        for(Policy policy : lookup) {
            if (Objects.equals(policy.getCoverageType(), coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // display policy by order
    public void displayAllPolicyByOrder() {
        System.out.println(order);
    }
}
