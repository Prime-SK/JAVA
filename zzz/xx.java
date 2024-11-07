package zzz;

class abc {
    int a;
    int b;

    public abc(){
    }

    public abc(int aIn, int bIn){
        a = aIn;
        b = bIn;
    }
}

public class xx{
    public static void main(String[] args) {
        abc obj1 = new abc(32,45);
        abc obj2 = new abc();
        // obj1.a = 10;
        // obj1.b = 20;

        // abc obj2 = new abc();
        // obj2.a = 30;
        // obj2.b = 40;

        System.out.println(obj1.a + " : " + obj1.b);
        System.out.println(obj2.a + " : " + obj2.b);
    }
} 
