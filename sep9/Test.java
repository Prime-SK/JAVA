package sep9;

import java.util.ArrayList;

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Institute institute = new Institute();
        institute.addStudent("John", "123");
        institute.addStudent("Jane", "456");
        institute.addCourse("Math", "M101");
        institute.addCourse("Science", "S101");


        int[] payments = new int[4];
        String[] studentIds = new String[2];

        ArrayList <Integer> payments2 = new ArrayList<>();
        ArrayList <String> studentIds2 = new ArrayList<>();
    }
}
