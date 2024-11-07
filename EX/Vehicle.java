package EX;

@SuppressWarnings("unused")
public class Vehicle {
    private String model; // method parameter name and the variable name is same 
    private int numWheels;   
    
    // public Vehicle (String model, int numWheels){
    //     this.model = model;
    //     this.numWheels = numWheels;
    // }

    public void setModel(String model){
        this.model = model; // this keyword used
    }

    public void setNumWheels(int wheels){
        this.numWheels = wheels;
    }
}