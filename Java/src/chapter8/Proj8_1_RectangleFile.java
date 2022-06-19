package chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleArrayList= new ArrayList<>();

        fillArrayList(rectangleArrayList);
        printRectangles(rectangleArrayList);
    }

    public  static  void fillArrayList(ArrayList<Rectangle> rectangles){
        Scanner inFile;

        try {
            inFile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;

            while (inFile.hasNext()){
                length = inFile.nextDouble();
                width = inFile.nextDouble();
                temp = new Rectangle(length,width);
                rectangles.add(temp);
            }
            inFile.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }

    }
    public static void printRectangles(ArrayList<Rectangle> rectangles){
        for (Rectangle rectangle:rectangles){
            System.out.println("Length: "+rectangle.getLength());
            System.out.println("Width: "+rectangle.getWidth());
            System.out.println("Area: "+rectangle.area());
            System.out.println("Perimeter: "+rectangle.perimeter());
            System.out.println();
        }
    }
}
