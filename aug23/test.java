package aug23;

public class test {
    public static void main(String[] args) {
        System.out.println(Power.power(4, 1));

        System.out.println(Math.abs(-12.73));
        System.out.println(Math.sqrt(64));

        System.out.println();

        Teacher sam = new Teacher("gas",10);
        sam.name = "Sam";
        sam.age = 30;
        sam.teacherID = "T00420";

        sam.info();

        Student john = new Student("balla",20);
        john.name = "John";
        john.age = 23;
        john.studentID = "S00420";

        john.info();
        john.changeValues();
        john.info();

    }
}
