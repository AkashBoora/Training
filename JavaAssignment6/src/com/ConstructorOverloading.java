package com;

public class ConstructorOverloading {

    public ConstructorOverloading(String string){
        this();
        System.out.println("The string is: "+string);
    }
    public ConstructorOverloading(){
        System.out.println("Default Constructor");
    }

}
