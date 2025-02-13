//Insurance Policy Management System
//
//Build a system for managing insurance policies where you have to:
//Store and manage policies with unique identifiers.
//Retrieve and manipulate policies based on different criteria.
//Track policies by various attributes such as policyholder name and expiry date.
//
//Requirements:
//        1. Store Policies in a Map:
//Use HashMap to store policies with policy numbers as keys and policy
//details as values.
//Use LinkedHashMap to maintain the insertion order of policies.
//Use TreeMap to store policies sorted by expiry date.
//
//2. Retrieve and Manipulate Policies:
//Implement methods to:
//Retrieve a policy by its number.
//List all policies expiring within the next 30 days.
//List all policies for a specific policyholder.
//Remove policies that are expired.




package collection.mapinterface.insurancepolicymanagementsystem;

import java.util.*;

public class InsurancePolicyManagementSystem {

    // manage policies with unique identifiers.
    private HashMap<Integer, Policy> policies;

    // to maintain order
    private Map<Integer, Policy> orderPolicies;

    //Use TreeMap to store policies sorted by expiry date.
    private Map<Integer, Policy> expiryPolicies;

    InsurancePolicyManagementSystem () {
        policies = new HashMap<>();
        orderPolicies = new LinkedHashMap<>();
        expiryPolicies = new TreeMap<>();
    }

    // adding policy
    public void addPolicy(Policy policy) {
        policies.put(policy.getPolicyNumber(), policy);
        orderPolicies.put(policy.getPolicyNumber(), policy);
        expiryPolicies.put(policy.getExpiryDate(), policy);
    }

    //Retrieve a policy by its number.
    public Policy getPolicy(Integer policyKey) {
        return policies.getOrDefault(policyKey, new Policy());
    }

    //Display all policies expiring within the next 30 days.
    public void displayExpiringWithin30Days() {
        for(Policy policy : expiryPolicies.values()) {
            if(policy.getExpiryDate() <= 30) {
                System.out.println(policy);
            }
        }
    }

    //List all policies for a specific policyholder.
    public void displayByPolicyHolder(String name) {
        for(Policy policy : policies.values()) {
            if(Objects.equals(policy.getPolicyholderName(), name)) {
                System.out.println(policy);
            }
        }
    }

    //Remove policies that are expired.
    public void removeExpiredPolicies() {
        for(Policy policy : expiryPolicies.values()) {
            if(policy.getExpiryDate() <= 0) {
                expiryPolicies.remove(policy.getPolicyNumber());
                policies.remove(policy.getPolicyNumber());
                orderPolicies.remove(policy.getPolicyNumber());
            }
        }
        System.out.println("Removed policies that are expired.");
    }

}
