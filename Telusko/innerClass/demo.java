package Telusko.innerClass;

class A{
    int value;

    public void show() {
        System.out.println("In A show");
    }

    class B{
        public void config() {
            System.out.println("In B config");
        }
        class X{
            public void somethingElse() {
                System.out.println("In X somethingElse");
            }
        }
    }

    static class C{
        public void something() {
            System.out.println("In C something");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();    
    /*  
        obj1.new B() is the syntax to create object of inner class
        obj1 is the object of outer class
        to create object of inner class, we need object of outer class
    */
        obj2.config();

        A.C obj3 = new A.C();
    /*
        obj3 is the object of static inner class
        static inner class can be accessed without object of outer class
    */
        obj3.something();

        A.B.X obj4 = obj2.new X();
        A.B.X obj5 = obj2.new X();
        obj4.somethingElse();
        obj5.somethingElse();
    }
}
