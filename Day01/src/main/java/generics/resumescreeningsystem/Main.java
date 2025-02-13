package org.example.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Alice", "Senior"));
        seResumes.processAllResumes();

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("Bob", "Mid-Level"));

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Charlie", "Junior"));
        allResumes.add(new ProductManager("Diana", "Senior"));

        ResumeScreeningSystem.screenResumes(allResumes);
    }
}
