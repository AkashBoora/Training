package chapter4;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        //resize is possiable
        //array list is only works with reference type

        arrayList.add("Jhon");
        arrayList.add("Akash");
        arrayList.add("Kyle");
        arrayList.add("Mike");

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        for(String name : arrayList){
            System.out.println(name);
        }
    }
}
