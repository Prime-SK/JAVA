package Telusko.anonymousInnerClass;

class A{
    public void show() {
        System.out.println("In A show");
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show(); 

        A obj2 = new A() {
            public void show() {
                System.out.println("In Anonymous class show");
            }
        };
    /*
        obj2 is the object of anonymous inner class
    */
        obj2.show();
    }
}
