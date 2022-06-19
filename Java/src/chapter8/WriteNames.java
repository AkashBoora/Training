package chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Akash");
        names.add("Boora");
        names.add("Venkat");
        names.add("Vamshi");
        names.add("Srinivas");

        try {
            PrintWriter printWriter = new PrintWriter("names.txt");
            for(String name :names){
                printWriter.println(name);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
