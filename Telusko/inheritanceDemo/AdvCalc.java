package Telusko.inheritanceDemo;
//used in demoCalc
public class AdvCalc extends Calc{
    //       AdvCalc  IS A   Calc

    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}
