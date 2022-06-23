package chapter3;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input%3==0)
            System.out.println("Divisible by three");
        else
            System.out.println("Not divisible by three");
    }
}
