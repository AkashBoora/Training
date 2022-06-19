package chapter2.introduction;

public class ConversionFun {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = 3.14f; //3.14 is double, so we need to put f at the end. narrowing/lossy conversion
        double yourDouble = myDouble; //widening/lose-less conversion

        byte myByte = 7 ;
        short myShort = 2613;
        int myInt = 78915321;
        long myLong =798786785;
        char myChar ='T';
        boolean myBoolean = false;

        System.out.println(myByte+" "+myShort+" "+myInt+" "+myLong+" "+myFloat+" "+myDouble+" "+myChar+" "+myBoolean);

    }
}
