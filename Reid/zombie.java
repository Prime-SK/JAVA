package Reid;

import java.util.*;

public class zombie {

    public static String intToRoman(int num) {
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = {"i", "iv", "v", "ix", "x", "xl", "l", "xc", "c", "cd", "d", "cm", "m"};

        StringBuilder roman = new StringBuilder();

        for (int i = values.length - 1; i >= 0; i--) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String l = "";
        int i = 0;
        String encoded = intToRoman(n);

        while (i < s.length()) {
            char temp = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == temp) {
                
                count++;
                i++;
            }
            l += temp;
            if (count > 1) {
                l = l + count;
                
            }
            i++;
        }
        sc.close();
        
        int k = l.length();
        StringBuilder pass = new StringBuilder();
        for (i = 0; i < encoded.length(); i++) {
            char ch;
            if (encoded.charAt(i) + k > 'z') {
                ch = (char) (encoded.charAt(i) + k - 26);
                
            } else {
                ch = (char) (encoded.charAt(i) + k);
            }
            pass.append(ch);
            
        }
        System.out.println(pass.toString());
    }
}
