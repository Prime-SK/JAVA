package EX;

import java.util.Scanner;

public class cal {
    //add
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public double add(double n1, double n2){
        return n1 + n2;
    }
    //substract
    public int sub(int n1 , int n2){
        return n1 - n2;
    }
    public double sub(double n1, double n2){
        return n1 - n2;
    }
    //multiply
    public int mul(int n1 , int n2){
        return n1 * n2;
    }
    public double mul(double n1, double n2){
        return n1 * n2;
    }
    //divide
    public int div(int n1 , int n2){
        if (n2 == 0) {
            throw new ArithmeticException("Division by 0 is not Allowed");
        }
        return n1 / n2;
    }
    public double div(double n1, double n2){
        if (n2 == 0) {
            throw new ArithmeticException("Division by 0 is not Allowed");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cal cal = new cal();
        System.out.println("-------------------");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        System.out.println("-------------------");
        System.out.print("Select an option : ");
        char op = sc.next().charAt(0);
        System.out.print("Choose Type -> Integer(i) or Double(d) : ");
        char type = sc.next().toLowerCase().charAt(0);
        if (type == 'i') {
            System.out.print("Enter 1st number : ");
            int fn = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int sn = sc.nextInt();
            switch (op) {
                case '+':
                    int x = cal.add(fn, sn);
                    // System.out.println(fn + " + " + sn + " = " + (cal.add(fn, sn)) );
                    System.out.println(fn + " + " + sn + " = " + x );
                    break;
                case '-':
                    System.out.println(fn + " - " + sn + " = " + (cal.sub(fn, sn)) );
                    break;
                case '*':
                    System.out.println(fn + " x " + sn + " = " + (cal.mul(fn, sn)) );
                    break;
                case '/':
                    System.out.println(fn + " / " + sn + " = " + (cal.div(fn, sn)) );
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }else if (type == 'd') {
            System.out.print("Enter 1st number : ");
            double fn = sc.nextDouble();
            System.out.print("Enter 2nd number : ");
            double sn = sc.nextDouble();
            switch (op) {
                case '+':
                    System.out.println(fn + " + " + sn + " = " + (cal.add(fn, sn)) );
                    break;
                case '-':
                    System.out.println(fn + " - " + sn + " = " + (cal.sub(fn, sn)) );
                    break;
                case '*':
                    System.out.println(fn + " x " + sn + " = " + (cal.mul(fn, sn)) );
                    break;
                case '/':
                    System.out.println(fn + " / " + sn + " = " + (cal.div(fn, sn)) );
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }else {
            System.out.println("Invalid Type");
        }
        sc.close();
    }
}
