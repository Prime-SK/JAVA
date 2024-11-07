package P23;

import java.util.ArrayList;

public class q1h {
    public static void main(String[] args) {
        int x=60;
        String y;
        y = (x>75)?"i60":(x>50)?"a80":"e50";

        System.out.println(y);

        String yy = "Aguamenti";
        yy=yy.concat("pakaya");
        System.out.println(yy);

        ArrayList<String> flower = new ArrayList<>();

        flower.add("Rose");
        flower.add(0,"Lily");
        flower.add("Iris");
        flower.set(1,"Jasmine");


        System.out.println(flower);

        String animal = "hippopotamus";
        String[] letters = animal.split("p");
        System.out.println(letters[0]);
        System.out.println(letters[1].length());
        System.out.println(letters[2]);
        System.out.println(letters[3]);     

        
    }
}
