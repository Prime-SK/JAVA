package sep9;

import java.util.ArrayList;

public class Institute {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Courses> courses = new ArrayList<Courses>();

    public void addStudent(String name, String ID) {
        Student student = new Student(name, ID);
        students.add(student);
    }

    public void addCourse(String courseName, String courseID) {
        Courses course = new Courses(courseName, courseID);
        courses.add(course);
    }

    public boolean searchStudent(String ID) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public Student getStudent(String ID) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                return student;
            }
        }
        return null;
    }
}