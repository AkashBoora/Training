package chapter8;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAge {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter printWriter;

        try {
            namesFile = new Scanner(new File("student_names.txt"));
            agesFile = new Scanner(new File("student_ages.txt"));
            printWriter = new PrintWriter("names_ages.txt");

            String tempName;
            int tempAge;

            while (namesFile.hasNext()){
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();

                printWriter.println(tempName+" is "+tempAge+" years old.");
            }

            namesFile.close();
            agesFile.close();
            printWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
