package Telusko.methodOverriding;

import java.util.ArrayList;

class A {
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    //This method Overrides the show(); from A class
    @Override
    public void show(){ 
        System.out.println("in B show");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(6);

        values.trimToSize();
    }
}
