package com;

public class Main {
    public static void main(String[] args) {
        SList<String> sList = new SList<String>();
        SListIterator<String> sListIterator = new SListIterator<>(sList);

        sListIterator.add("Akash");
        System.out.println(sList.toString());

        sListIterator.add("Boora");
        System.out.println(sList.toString());

        sListIterator.remove();
        sListIterator.add("Hello");
        sListIterator.add("Boora");
        System.out.println(sList.toString());
    }

}
