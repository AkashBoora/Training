package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;
        int guessNumber;
        int guessCount = 0;


        while(true){
            System.out.println("Enter your guess: ");
            guessNumber = scanner.nextInt();
            guessCount++;

            if(guessNumber >=1 && guessNumber <= 100){
                if(guessNumber > randomNumber)
                    System.out.println("Too High");
                else if(guessNumber < randomNumber)
                    System.out.println("Too Low");
                else {
                    System.out.println("Congratulations, you guess the number in " + guessCount + " guess. Thanks for Playing");
                    break;
                }
            }
            else
                System.out.println("Please guess between 1 to 100.");
        }
    }
}
