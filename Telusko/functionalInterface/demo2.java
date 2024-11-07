package Telusko.functionalInterface;

@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void show(int x, int y);
}

@FunctionalInterface
interface C{
    int add (int x, int y);
}

public class demo2 {
    public static void main(String[] args) {
        //Lambda Expression
        A obj = () -> {
            System.out.println("In show");
        };
        obj.show();
        /*
            Since A has only one abstract method, we can use lambda expression
            
            A obj = () -> {
                System.out.println("In show");
                };

            OR
            A obj = () -> System.out.println("In show");
            as the method has only one statement
        */
        B obj2 = (x, y) -> System.out.println("In show " + x + " & " + y);
        //no need to specify the data type of x and y
        
        obj2.show(5, 6);

        C obj3 = (x, y) -> {
            return x + y;
        };
        System.out.println(obj3.add(5, 6));
        /*
            Since add method has a return type, we need to use return statement
            If the method has only return statement, we can remove the return keyword

            C obj3 = (x, y) -> x + y;
        */
    }   
}
