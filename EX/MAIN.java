package EX;

public class MAIN {

    public static int add (int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Vehicle jeep = new Vehicle();

        jeep.setModel("JEEP"); 
        jeep.setNumWheels(4);

        // int sum = add(4,5);

        //  model and numWheels are private variables 
        //  in the class Vehicle
        //  without directly acsessing the attributes
        //  we can set values
        //  this is ENCAPSULATION
    }


}
