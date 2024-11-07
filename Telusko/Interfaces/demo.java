package Telusko.Interfaces;
/*
    abstract class A{
        public abstract void show();
        public abstract void display();
    }

    A has only abstract methods
    so we can use interface instead of abstract class
*/

interface A{
    int i = 10; 
    String s = "Hello";
    // by default all the variables in interface are public, static and final

    void show();
    void display();
    // by default all the methods in interface are public and abstract
}

interface X{
    void run();
}

interface Y { 
    void walk();
}

interface Z extends X, Y{ // can extend multiple interfaces
    void eat();
}

class B implements A, Z{ // can implement multiple interfaces
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    }
    public void run(){
        System.out.println("Run");
    }
    public void walk(){
        System.out.println("Walk");
    }
    public void eat(){
        System.out.println("Eat");
    }
}

public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();

        System.out.println(A.i);
        System.out.println(A.s);
    }
}
