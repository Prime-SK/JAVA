package Telusko.inheritanceDemo;
//used in demoCalc
public class VeryAdvCalc extends AdvCalc{
    public int power (int n1,int n2){
        return (int)Math.pow(n1, n2);
    }
}
/*
    VeryAdvCalc --> AdvCalc --> Calc
    this is called muti-level inheritance
 */