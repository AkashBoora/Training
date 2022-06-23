package com;

public class Cycle {
    public void balance()
    {
        System.out.println("Cycle Balance");
    }
}

class Unicycle extends Cycle {

    @Override
    public void balance()
    {
        System.out.println("Unicycle balance");
    }
}

class Bicycle extends Cycle {

    @Override
    public void balance()
    {
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends Cycle {

}