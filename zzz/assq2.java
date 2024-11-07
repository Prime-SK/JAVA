package zzz;
public class assq2 {
    public static int solution(int[] array){
        // Your code goes here
        int maxArea = 0;
        for(int i = 0 ; i < array.length-1 ; i++){
            int len = 1;
            for(int j = i + 1 ; j < array.length ; j++){
                if(array[i]<array[j]){
                    if((array[i]*len)>maxArea){
                        maxArea = array[i]*len;
                    }
                }else{
                    if((array[j]*len)>maxArea){
                        maxArea = array[j]*len;
                    }
                }
                len++;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println("max area = " + solution(arr));
    }
}
