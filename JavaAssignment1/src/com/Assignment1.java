package com;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File home = new File("/home/akasb");
        File[] allFiles = home.listFiles();
        int choice;
        boolean exit = false;

        while(!exit){
            System.out.println("Select any one option:\n1. All files\n2. All visiable files\n3. StarsWith\n4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                printList(allFiles, "^[.a-zA-Z]+");
            } else if (choice == 2) {
                printList(allFiles, "^[a-zA-Z]+");
            } else if (choice == 3) {
                System.out.println("Enter StsrtsWith word");
                String string = scanner.next();
                printList(allFiles, "^"+string+".*$");
                exit=true;
            }else{
                exit = true;
            }
        }
    }

    public static void  printList(File[] files, String pattern){
        for(File file : files){
            if(Pattern.matches(pattern,file.getName()))
                System.out.println(file.getName()+"\t"+file.getAbsoluteFile());
        }
        System.out.println();
    }
}
