package sep9;

public class Courses {
    private String courseName;
    private String courseID;

    public Courses(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }
}
