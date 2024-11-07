package EX;

import java.util.Arrays;

public class sort {
    public static void ArrSort(int[] arr){
        Arrays.sort(arr);
        // return arr;
    }
    public static void main(String[] args) {
        int a[] = {7,2,6,4,2,7,9,0,5};

        ArrSort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
