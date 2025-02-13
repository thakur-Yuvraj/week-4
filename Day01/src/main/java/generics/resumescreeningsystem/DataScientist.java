package org.example.resumescreeningsystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public void processResume() {
        System.out.println("Screening Data Scientist resume for " + candidateName + " with experience level: " + experienceLevel);
    }
}
