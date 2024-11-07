package Telusko.Exceptions;

public class demo {

    public void divideZero(int a, int b) throws Exception{

            System.out.println("Output is: " + (a / b));

    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        int k;
        int[] a = new int[4];
        String s = null;
        
        demo d = new demo();

        try{
            d.divideZero(5, 0);
        }
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }


        // try {
        //     System.out.println(a[4]);
        // }
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Error : " + e.getMessage());
        // }

        // try {
        //     System.out.println(s.length());
        // }
        // catch (Exception e) {
        //     System.out.println("Error : " + e.getMessage());
        // }
        System.out.println("bye");
    }
}
