package Telusko.anonymousInnerClass;

interface xxx{
    void dothis();
}

abstract class dothat implements xxx{

}

class yyy extends dothat{
    public void dothis(){
        
    }
}

public class kkk {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Float f1 = new Float(3.0);
        int x = f1.intValue();
        System.out.println(x);
        byte y = f1.byteValue();
        System.out.println(y);
        double d = f1.doubleValue();
        System.out.println(x+y+d);
    }
}
