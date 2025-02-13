import org.example.resumescreeningsystem.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ResumeScreeningTest {

    @Test
    void testResumeCreation() {
        SoftwareEngineer se = new SoftwareEngineer("Alice", "Senior");
        DataScientist ds = new DataScientist("Bob", "Mid-Level");
        ProductManager pm = new ProductManager("Charlie", "Junior");

        assertEquals("Alice", se.getCandidateName());
        assertEquals("Mid-Level", ds.getExperienceLevel());
        assertEquals("Charlie", pm.getCandidateName());
    }

    @Test
    void testAddingResumesToResumeManager() {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        SoftwareEngineer alice = new SoftwareEngineer("Alice", "Senior");
        seResumes.addResume(alice);

        assertEquals(1, seResumes.getResumes().size());
        assertEquals("Alice", seResumes.getResumes().get(0).getCandidateName());
    }

    @Test
    void testScreeningSystemWithWildcard() {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer("Alice", "Senior"));
        resumes.add(new DataScientist("Bob", "Mid-Level"));
        resumes.add(new ProductManager("Charlie", "Junior"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ResumeScreeningSystem.screenResumes(resumes);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Screening Software Engineer resume for Alice"));
        assertTrue(output.contains("Screening Data Scientist resume for Bob"));
        assertTrue(output.contains("Screening Product Manager resume for Charlie"));
    }
}
