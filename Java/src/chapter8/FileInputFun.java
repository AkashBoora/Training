package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner inFile;
        int sum =0;

        try{
            inFile = new Scanner(new File("input.txt"));

            int input;


            while ((inFile.hasNext())){
                input = inFile.nextInt();
                System.out.println(input);
                sum+=input;
            }

            System.out.println("Sum is: "+sum);
            inFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Can't read File");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Input type is not matching");
            System.out.println(e.getMessage());
        }
    }
}
