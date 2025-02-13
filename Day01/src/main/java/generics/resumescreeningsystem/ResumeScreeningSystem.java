package org.example.resumescreeningsystem;

import java.util.List;

public class ResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.processResume();
        }
    }
}
