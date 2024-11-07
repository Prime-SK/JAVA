package Telusko.Exceptions;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class demo2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 15 / i;
            if(j == 0) {
                throw new CustomException("J is 0");
            }
        }
        catch (CustomException e) {
            System.out.println("Error : " + e.getMessage());
            j = 1;
            System.out.println("J is now: " + j);
        }
    }
}
