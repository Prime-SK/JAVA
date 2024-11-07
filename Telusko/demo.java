package Telusko;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void showStatic(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        // obj1.name = "SmartPhone"; // Static variable can be accessed from class name
        Mobile.name = "SmartPhone";
        System.out.println();
        // System.out.println(obj1.name);

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        // obj2.name = "Smartphone";
        
        obj1.show();
        obj2.show();
        System.out.println();

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        System.out.println();

        Mobile.showStatic(obj1);
    }
}
