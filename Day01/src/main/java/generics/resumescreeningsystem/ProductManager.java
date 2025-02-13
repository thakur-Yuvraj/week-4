package org.example.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public void processResume() {
        System.out.println("Screening Product Manager resume for " + candidateName + " with experience level: " + experienceLevel);
    }
}
