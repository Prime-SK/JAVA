package zzz;

import java.util.HashSet;

public class DuplicateFinder {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 8, 9, 2, 6, 8, 5};
        
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                duplicates.add(num);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("There are no repeating values");
        } else {
            System.out.print("Repeating values are ");
            String separator = "";
            for (int duplicate : duplicates) {
                System.out.print(separator + duplicate);
                separator = " , ";
            }
        }
    }
}
