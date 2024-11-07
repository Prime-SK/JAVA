package Telusko.inheritanceDemo;

public class DemoCalc {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        Calc obj = new Calc();

        int r1 = obj.add(4, 5);
        int r2 = obj.add(8, 5);
        
        System.out.println("Calc object : " + r1 + " | " + r2);
        
        AdvCalc exObj = new AdvCalc();
        int r3 = exObj.add(8, 5);
        int r4 = exObj.sub(8, 5);
        int r5 = exObj.mul(8, 5);
        int r6 = exObj.div(8, 5);
        
        System.out.println("AdvCalc object : " + r3 + " | " + r4 + " | " + r5 + " | " + r6);
        
        VeryAdvCalc exExObj = new VeryAdvCalc();
        int r7 = exExObj.add(8, 5);
        int r8 = exExObj.sub(8, 5);
        int r9 = exExObj.mul(8, 5);
        int r10 = exExObj.div(8, 5); 
        int r11 = exExObj.power(2, 5); 
        
        System.out.println("VeryAdvCalc object : " + r7 + " | " + r8 + " | " + r9 + " | " + r10 + " | " + r11);
        
        System.out.println(Math.pow(2,-3));
    }
}
