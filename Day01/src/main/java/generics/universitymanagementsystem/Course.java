package generics.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>{
    List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourse() {
        return courses;
    }

    public static void printAllCourses(List<? extends CourseType> courses) {

    }
}
