package Telusko;
public class first {
    public static void main(String[] args) {
        // INTEGERS
        byte by = 1;    //1byte
        short sh = 4;   //2bytes
        int in = 5;     //4bytes
        long lo = 34l;  //8bytes

        int binary = 0b10011;       // 0b for binary
        int hexa = 0x10e;          // 0x for hexadecimals

        //FLOAT
        float fl = 2.67f;
        double dou = 6.7;

        //CHAR
        char ch = 'a';

        //BOOLEAN
        boolean bo = true;

        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);
        System.out.println(ch);
        System.out.println(bo);
        System.out.println(binary);
        System.out.println(hexa);

        //ARRAY DECLARATION
        System.out.println("Array...");
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
        }
        //ASSIGN A RANDOM NUMBER FROM 0 TO 9
        //Math.random() returns a double value so needs to me casted to int

        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Multidimensional Array...");
        int mulArr[][] = new int[3][4];

        for(int i=0;i<mulArr.length;i++){
            for(int j=0;j<mulArr[i].length;j++){
                mulArr[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[] : mulArr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println();

        //JAGGED ARRAYS
        System.out.println("Jagged Array...");
        int jArr[][] = new int[3][];

        jArr[0] = new int[3];
        jArr[1] = new int[4];
        jArr[2] = new int[2];

        for(int i=0;i<jArr.length;i++){
            for(int j=0;j<jArr[i].length;j++){
                jArr[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[] : jArr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }    
}