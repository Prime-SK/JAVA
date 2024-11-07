package Telusko.functionalInterface;

/*
    A is a SAM interface: Single Abstract Method interface
    OR 
    A is a functional interface
    Functional interface is an interface with only one abstract method
    Functional interface can have any number of default methods
*/
@FunctionalInterface
interface S{
    void show();
    default void display(){
        System.out.println("In display");
    }
}
/*
    If we add another abstract method, 
    it will give an error because of the functional interface annotation
*/

class T implements S{
    public void show(){
        System.out.println("In show");
    }
}

public class demo {
    public static void main(String[] args) {
        S obj = new T();
        obj.show();
        obj.display();

        S obj2 = new S(){
            public void show(){
                System.out.println("In Anon Show");
            }
        };
        obj2.show();
        obj2.display();
    }
}
