package HR;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
class Shape{
    int length;
    int breadth;
    
    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println(length + " " + breadth);
    }
}

class Rectangle extends Shape{
    public Rectangle(int length, int breadth){
        super(length, breadth);
    }

    public void area(){
        System.out.println(length * breadth);
    }
}

public class sol {
    @SuppressWarnings("unused")
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Shape s = new Rectangle(length, breadth);
        s.area();

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        sc.close();
    }
}
