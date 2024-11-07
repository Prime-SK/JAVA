package zzz;

abstract class Base extends Object{
    public Base(){
        super();
        System.out.println("Base ");
    }
}

class Derived extends Base{
    public Derived(){
        System.out.println("Derived ");
    }
}

class DeriDerived extends Derived{
    public DeriDerived(){
        // super();
        System.out.println("DeriDerived");
    }
}

public class Test {
    public static void main(String[] args) {
        Derived b = new DeriDerived();
        System.out.println(b.hashCode());

        char[] c = {'a', 'b', 'c'};
        System.out.println(c);
    }
}
