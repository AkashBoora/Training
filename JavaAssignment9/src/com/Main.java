package com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(Pattern.matches("^[A-Z].*\\.",input)){
            System.out.println("The given string starts with the capital letter and ends with a period.");
        } else if (Pattern.matches("^[A-Z].*",input)) {
            System.out.println("The given string starts with the capital letter and doesn't end with period.");
        } else if (Pattern.matches("\\.",input)) {
            System.out.println("The given string doesn't starts with capital letter but ends with period.");
        }else {
            System.out.println("The given string doesn't starts with capital letter and doesn't ends with period.");
        }

    }
}
