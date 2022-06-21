package com;

interface InterFaceOne{
    public void methodOneOfInterfaceOne();
    public void methodTwoOfInterfaceOne();
}

interface InterFaceTwo{
    public void methodOneOfInterfaceTwo();
    public void methodTwoOfInterfaceTwo();
}

interface InterfaceThree{
    public void methodOneOfInterfaceThree();
    public void methodTwoOfInterfaceThree();
}

interface CombineInterface extends InterFaceOne,InterFaceTwo, InterfaceThree{
    public void combineMethod();
}

public class InterfacesPractice implements CombineInterface{
    @Override
    public void methodOneOfInterfaceOne() {
        System.out.println("Method-1 of InterfaceOne");
    }

    @Override
    public void methodTwoOfInterfaceOne() {
        System.out.println("Method-2 of InterfaceOne");
    }

    @Override
    public void methodOneOfInterfaceTwo() {
        System.out.println("Method-1 of InterfaceTwo");
    }

    @Override
    public void methodTwoOfInterfaceTwo() {
        System.out.println("Method-2 of InterfaceTwo");
    }

    @Override
    public void methodOneOfInterfaceThree() {
        System.out.println("Method-1 of InterfaceThree");
    }

    @Override
    public void methodTwoOfInterfaceThree() {
        System.out.println("Method-2 of InterfaceThree");
    }

    @Override
    public void combineMethod() {
        System.out.println("combineMethod of CombineInterFace");
    }
}

class InterfaceAsArguments{
    public void passingInterfaceOne(InterFaceOne interFaceOne){
        interFaceOne.methodOneOfInterfaceOne();
        interFaceOne.methodTwoOfInterfaceOne();
    }

    public void passingInterfaceTwo(InterFaceTwo interFaceTwo){
        interFaceTwo.methodOneOfInterfaceTwo();
        interFaceTwo.methodTwoOfInterfaceTwo();
    }

    public void passingInterfaceThree(InterfaceThree interfaceThree){
        interfaceThree.methodOneOfInterfaceThree();
        interfaceThree.methodTwoOfInterfaceThree();
    }

    public void passingCombineInterface(CombineInterface combineInterface){
        combineInterface.combineMethod();
    }
}