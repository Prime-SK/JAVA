package zzz;

// abstract class car{
//     public abstract void drive();

//     public void stop(){
//         System.out.println("Break");
//     }
// }

// class Audi extends car{
//     public void drive(){
//         System.out.println("Audi is driving");
//     }
// }

// class BMW extends car{
//     public void drive(){
//         System.out.println("BMW is driving");
//     }

//     public void stop(){
//         System.out.println("BMW Break");
//     }
// }

//Create an immutable class named 'ImmutableClass' 

// final class ImmutableClass {
//     private final int i;

//     public ImmutableClass(int i) {
//         this.i = i;
//     }

//     public int getI() {
//         return i;
//     }
// }

class A{
    public void showA(){
        System.out.println("Show A");
    }
}

class B extends A{
    public void showB(){
        System.out.println("Show B");
    }
}

public class Demo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Audi obj = new Audi();
        // obj.drive();
        // obj.stop();

        // BMW obj2 = new BMW();
        // obj2.drive();
        // obj2.stop();

        //Type casting
        int i = 10;
        double d = i; //implicit type casting
        System.out.println(d);

        double d2 = 10.5;
        int i2 = (int)d2; //explicit type casting

        System.out.println(i2);

        A obj = new B();
        obj.showA();

        B obj2 = (B)obj;

    }
}
