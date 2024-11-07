package Telusko.Exceptions;

class A{

    public void show() throws ClassNotFoundException {
        Class.forName("Telusko.Exceptions.demo4");
    }
}

public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        A obj = new A();
        // try {
            obj.show();
        // } catch (ClassNotFoundException e) {
            // e.printStackTrace();
        // }
        
    }
}
