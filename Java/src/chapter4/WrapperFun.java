package chapter4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();

        integerList.add(10);
        integerList.add(20);

        for(int num : integerList){
            System.out.println(num);
        }

        String someValue = "4534";
        int intValue = Integer.parseInt(someValue);

        System.out.println(intValue);

        String doubleValue = "3.14159";
        double doubleValue2 = Double.parseDouble(doubleValue);

        System.out.println(doubleValue);
    }
}
