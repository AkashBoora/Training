package chapter3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade");
        grade = scanner.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Great Job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good Job!");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better");
                break;
            case 'D':
            case 'd':
                System.out.println("You're getting pretty close to failing");
                break;
            case 'F':
            case 'f':
                System.out.println("You are failing the course");
                break;
            default:
                System.out.println("You have entered invalid grade");

        }
    }
}
