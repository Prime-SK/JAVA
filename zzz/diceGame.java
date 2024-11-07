package zzz;
import java.util.Random;
import java.util.Scanner;

public class diceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int p1 = 0;
        int p2 = 0;
        int nowPlaying = 1;
        
        while (p1 < 100 && p2 < 100) {
            System.out.print("Player " + nowPlaying + "'s turn : Press ENTER to roll the dice...");
            sc.nextLine();
            
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            
            System.out.println("Player " + nowPlaying + " Rolled: " + dice1 + " and " + dice2);
            
            if (dice1 == 1 && dice2 == 1) {
                System.out.println("Both dice are 1. Score reset to 0.");
                if (nowPlaying == 1) {
                    p1 = 0;
                } else {
                    p2 = 0;
                }
            } else {
                int total = dice1 + dice2;
                if (nowPlaying == 1) {
                    p1 += total;
                } else {
                    p2 += total;
                }
                System.out.println("Added " + total + " to Player " + nowPlaying + "'s score.");
            }
            
            System.out.println("Player 1 Score: " + p1);
            System.out.println("Player 2 Score: " + p2);
            System.out.println();
            
            if (dice1 != dice2 || (dice1 == 1 && dice2 == 1)) {
                nowPlaying = (nowPlaying == 1) ? 2 : 1;
            }
        }
        if (p1 >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
        sc.close();
    }
}