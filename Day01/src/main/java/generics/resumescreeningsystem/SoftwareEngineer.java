package org.example.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public void processResume() {
        System.out.println("Screening Software Engineer resume for " + candidateName + " with experience level: " + experienceLevel);
    }
}
