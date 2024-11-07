package Telusko;
//ENCAPSULATION
class Human {
    private int age;
    private String name;

    //DEFAULT CONSTRUCTOR
    public Human(){                         
        age = 18;
        name = "GasBalla";
    }

    //PARAMETERIZED CONSTRUCTOR
    public Human(String name, int age){         
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}
public class demo2 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj2 = new Human("GAS",21);
        System.out.println(obj2.getName() + " : " + obj2.getAge());

        obj.setName("Thathsara");
        obj.setAge(23);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }    
}
