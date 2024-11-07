package aug23;
//Cannot create objects of this class
//But other classes can inherit from this class
public abstract class Person {  
    public String name;
    protected int age;
    private String phoneNo;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("Name " + name + " \t| Age " + age + " \t| Phone No " + phoneNo);
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
