package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner inputFile;
        PrintWriter outputFile;

        try {
            inputFile = new Scanner(new File("nums.txt"));
            outputFile = new PrintWriter("twice_nums");

            while (inputFile.hasNext()){
                outputFile.println(inputFile.nextInt()*2);
            }
            inputFile.close();
            outputFile.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
