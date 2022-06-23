package com;

public class FirstOutterClass {
    class FirstInnerClass{
        FirstInnerClass(String message){
            System.out.println("First inner class constructor message: "+message);
        }
    }
}

class SecondOutterClass{
    class SecondInnerClass extends FirstOutterClass.FirstInnerClass{

        SecondInnerClass() {
            new FirstOutterClass().super("Second Inner Class");
        }
    }
}
