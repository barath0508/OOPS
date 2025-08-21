package Student;

import java.util.ArrayList;

class Course {
    private String courseId;
    private String title;
    private ArrayList<String> students;  // List to store student names

    // Constructor
    public Course(String courseId, String title) {
        this.courseId = courseId;
        this.title = title;
        this.students = new ArrayList<>();
    }

    // Method to enroll a student
    public void enrollStudent(String studentName) {
        if (!students.contains(studentName)) {
            students.add(studentName);
            System.out.println(studentName + " enrolled in " + title);
        } else {
            System.out.println(studentName + " is already enrolled in " + title);
        }
    }

    // Method to remove a student
    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " removed from " + title);
        } else {
            System.out.println(studentName + " is not enrolled in " + title);
        }
    }

    // Display course details
    public void displayCourse() {
        System.out.println("Course ID: " + courseId + ", Title: " + title);
        System.out.println("Enrolled Students: " + students);
    }
}

// Main class to test
public class test {
    public static void main(String[] args) {
        Course course = new Course("CSE101", "Introduction to Programming");

        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        course.enrollStudent("Alice"); // Duplicate check

        course.displayCourse();

        course.removeStudent("Bob");
        course.removeStudent("Charlie"); // Not enrolled

        course.displayCourse();
    }
}
