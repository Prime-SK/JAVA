package aug23;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    protected String studentID;

    public void changeValues(){
        name = "John Cena";
        age = 25; // Protected variaables can be accessed inside the same package
        // phoneNo = "235678876";

        super.setPhoneNo("56787654");
    }
    @Override
    public void info(){
        System.out.println("Student Name " + name + " \t| Age " + age);
    }
}
