package chapter5;

public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "Akash Boora";
        String name2 = "Akash Boora";
        String name3 = "Vamshi Boora";

        for(int i=0;i<name1.length();i++){
            System.out.print(name1.charAt(i)+" ");
        }

        System.out.println();

        System.out.println(name1.equals(name2)?"Strings are equal":"Strings are not equal");

        System.out.println(name1.compareTo(name3));
        //returns -ve if name1 < name2
        //returns 0 if name1==name2
        //returns +ve if name1 < name2

        System.out.println(name1.compareTo(name2));

        String name4 = "Jhon Thomas";
        System.out.println(name1.compareTo(name4));
    }
}
