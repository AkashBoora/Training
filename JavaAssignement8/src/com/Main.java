package com;

import java.util.Scanner;

class NameException extends Exception {
    public NameException(String message) {
        System.out.println(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        System.out.println(message);
    }
}

class EmailException extends Exception {
    public EmailException(String message) {
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String emailId = scanner.nextLine();

        try {
            if (!name.replace(" ","").matches("^[a-zA-Z]*$")) {
                throw new NameException("Name should contain alphabets only");
            }
            if (age < 18) {
                throw new AgeException("Age should be greater than or equals to 18");
            }
            if (!emailId.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
                throw new EmailException("Invalid emailId");
            }
        } catch (Exception message) {
            System.out.println(message);
        } finally {
            System.out.println("Closing main method");
        }
    }
}
