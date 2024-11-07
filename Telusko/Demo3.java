package Telusko;

class A {
    public A() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println();

        new A(); // Anonymous object created
        System.out.println();

        new A().show(); //we cannot use the same object again 

    }
}
