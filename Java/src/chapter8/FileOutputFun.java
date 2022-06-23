package chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(("output.txt"));

            printWriter.println("Hello there");
            printWriter.println("My name is Akash Boora");
            printWriter.close();

        }catch (FileNotFoundException ex){
            System.out.println("Couldn't write to the file!");
        }
    }
}
