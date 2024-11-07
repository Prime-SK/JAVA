package Telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputs {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int i = Integer.parseInt(br.readLine());
        System.out.println(i);

        br.close();
    }
}
