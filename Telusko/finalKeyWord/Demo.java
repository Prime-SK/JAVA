package Telusko.finalKeyWord;

public class Demo {
    final class Calc{
        public void show(){
            System.out.println("In calc show");
        }
        public void add(int n1, int n2){
            System.out.println(n1+n2);
        }
    }

    // class AdvCalc extends Calc{

    // } THIS WILL NOT WORK AS THE Calc CLASS IS FINAL 

    public static void main(String[] args) {
        //FINAL KEYWORD IS USED TO CREATE A CONSTANT
        final int number = 8;
        // number = 9; THIS DOESNT WORK

        System.out.println(number);
    }
}
