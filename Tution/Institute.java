

import java.util.ArrayList;


public class Institute {
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String regNo, String password ) {
        Student s = new Student(name, regNo, password);
        students.add(s);
    }
    public void addCourse(String courseName, String courseCode){
    Course c = new Course(courseName, courseCode);
    courses.add(c);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    int searchStudent(String regNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRegNo().equals (regNo)) {
                return i;
            }
        }
        return -999; // -1 is a common return value for "not found" in many languages
    }
}
