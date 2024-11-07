package Telusko.Enumaration;

enum Laptop{
    Dell(1200),HP(1500),Lenovo,Asus(2100);

    private int price;

    private Laptop(){
        // default constructor
        // this gets called 1 time in this example -> Lenovo
    }
    private Laptop(int price){
        this.price = price; 
        //this gets called 3 times in this example
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

public class demo2 {
    public static void main(String[] args) {

        for(Laptop l: Laptop.values()){
            System.out.println(l + " : " + l.getPrice());
        }

    }
}
