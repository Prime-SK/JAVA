package zzz;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Thathsara";
        String str3 = "Welcome " + str2;
        String str4 = "hello";

        String c = "abcdefghijkl".substring(5,9);
        System.out.println(c);
        
        System.out.println(str3);
        System.out.println(str3.substring(4,10));
        System.out.println(str3.toUpperCase());
        
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.equals(str2));

        String x = "a";
        String y = "b";
        String z = "c";

        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(z.compareTo(x));

        System.out.println(str1.compareTo(str4));


        System.out.println(capf("oi gas ballo koheda yanne"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sen = sc.nextLine();

        int count = sen.split("\\s+").length;
        System.out.println("No of words : " + count);

        String array[] = sen.split("\\s+");
        //SPLITS THE STRING INTO WORDS AND STORES IN AN ARRAY
        //ARRAY.LENTH() METHOD GIVES THE NO OF WORDS 

        for(String m : array){
            System.out.println(m);
        }
        sc.close();
    }
    // Capitalize first letter
    public static String capf(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}