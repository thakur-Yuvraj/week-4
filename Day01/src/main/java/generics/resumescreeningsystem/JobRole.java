package org.example.resumescreeningsystem;

public abstract class JobRole {
    protected String candidateName;
    protected String experienceLevel; // e.g., "Junior", "Mid", "Senior"

    public JobRole(String candidateName, String experienceLevel) {
        this.candidateName = candidateName;
        this.experienceLevel = experienceLevel;
    }

    public abstract void processResume();

    public String getCandidateName() {
        return candidateName;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }
}
