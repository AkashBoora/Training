package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NullPointerException, IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        LocalDate signupDate,presentDate;
        final DateTimeFormatter formatType =DateTimeFormatter.ofPattern("dd-MM-yyyy");

        int noOfTestCases = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<noOfTestCases;i++){
            String signUpDateString = scanner.next();
            String presentDateString = scanner.next();
            signupDate = LocalDate.parse(signUpDateString,formatType);
            presentDate = LocalDate.parse(presentDateString,formatType);
            printNewSignDate(signupDate,presentDate);
        }

    }
    public static void printNewSignDate(LocalDate signupDate, LocalDate presentDate){
        LocalDate newSignUpMinus,newSignUpPlus;
        final DateTimeFormatter formatType =DateTimeFormatter.ofPattern("dd-MM-yyyy");


        if(presentDate.compareTo(signupDate)>0){
            int diffYears = presentDate.getYear()-signupDate.getYear();
            newSignUpMinus = signupDate.plusYears(diffYears).minusDays(30);
            newSignUpPlus = signupDate.plusYears(diffYears).plusDays(30);

            if(presentDate.compareTo(newSignUpPlus)>0){
                System.out.println(newSignUpMinus.format(formatType)+" "+newSignUpPlus.format(formatType));
            }else {
                System.out.println(newSignUpMinus.format(formatType)+" "+presentDate.format(formatType));
            }
        }else{
            System.out.println("No range");
        }
    }
}
