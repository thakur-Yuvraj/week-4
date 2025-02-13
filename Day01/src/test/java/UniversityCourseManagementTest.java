import org.example.multilevelcoursemanagementsystem.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityCourseManagementTest {

    @Test
    void testCourseCreationAndName() {
        ExamCourse math = new ExamCourse("Mathematics");
        AssignmentCourse programming = new AssignmentCourse("Programming Fundamentals");
        ResearchCourse ai = new ResearchCourse("AI Research");

        assertEquals("Mathematics", math.getCourseName());
        assertEquals("Programming Fundamentals", programming.getCourseName());
        assertEquals("AI Research", ai.getCourseName());
    }

    @Test
    void testCourseEvaluation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ExamCourse math = new ExamCourse("Mathematics");
        math.evaluate();

        AssignmentCourse programming = new AssignmentCourse("Programming Fundamentals");
        programming.evaluate();

        ResearchCourse ai = new ResearchCourse("AI Research");
        ai.evaluate();

        String output = outputStream.toString().trim();

        assertTrue(output.contains("Mathematics is evaluated through exams."));
        assertTrue(output.contains("Programming Fundamentals is evaluated through assignments."));
        assertTrue(output.contains("AI Research is evaluated through research papers."));
    }

    @Test
    void testAddAndShowCourses() {
        Course<ExamCourse> courseManager = new Course<>();
        ExamCourse math = new ExamCourse("Mathematics");
        courseManager.addCourse(math);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        courseManager.showCourses();
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Mathematics is evaluated through exams."));
    }

    @Test
    void testDisplayCoursesWithWildcard() {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Programming"));
        courses.add(new ResearchCourse("AI Research"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        University.displayCourses(courses);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Mathematics is evaluated through exams."));
        assertTrue(output.contains("Programming is evaluated through assignments."));
        assertTrue(output.contains("AI Research is evaluated through research papers."));
    }
}

