package zzz;

abstract class ABCDEF{
    int i = 55;

    public void show(){
        System.out.println("In ABCDEF show " + i);
    }

    public final void display(){
        System.out.println("FINAL display");
    }

    public abstract void write();
}

class XYZ extends ABCDEF{
    int i = 34;

    @Override
    public void show(){
        System.out.println("Overridden show ");
        System.out.println("In XYZ show");
    }

    @Override
    public void write(){
        System.out.println("In XYZ write");
    }
}

public class AbsClass {
    public static void main(String[] args) {
        // ABCDEF obj = new ABCDEF();
        // obj.show();

        XYZ obj2 = new XYZ();
        obj2.show();
        obj2.write();
        obj2.display();

    }
}
