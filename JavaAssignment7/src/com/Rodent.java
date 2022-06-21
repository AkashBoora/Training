package com;

public abstract class Rodent {
    public abstract void getColour();
    public abstract void getSize();
    public abstract void getFood();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("new mouse is created");
    }

    @Override
    public void getColour() {
        System.out.println("Mouses are in Black to White, Brown to Yellow colours");
    }

    @Override
    public void getSize() {
        System.out.println("Mouse is in between 5-7 inches length");
    }

    @Override
    public void getFood() {
        System.out.println("Mouse eats Grains, seeds, and fruits");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("new gerbil is created");
    }
    @Override
    public void getColour() {
        System.out.println("Gerbils are in Argente Golden, Black, Golden Agouti, Gray Agouti, Lilac, and Slate colours");
    }

    @Override
    public void getSize() {
        System.out.println("Gerbil is in between 3-4 inches length");
    }

    @Override
    public void getFood() {
        System.out.println("Gerbil eats Seeds, Fruits, Vegetables, and Insects");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("new hamster is created");
    }
    @Override
    public void getColour() {
        System.out.println("Hamsters are of black, grey, brown, white, yellow, red or a mixture of several colors");
    }

    @Override
    public void getSize() {
        System.out.println("Hamster is in between 4.5-10 cm length");
    }

    @Override
    public void getFood() {
        System.out.println("Hamster eats Grains, seeds, and nuts");
    }
}