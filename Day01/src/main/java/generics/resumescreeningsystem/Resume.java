package org.example.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }

    public void processAllResumes() {
        for (T resume : resumes) {
            resume.processResume();
        }
    }
}
