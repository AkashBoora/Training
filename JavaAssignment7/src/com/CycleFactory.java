package com;

public class CycleFactory {
    public Cycle getMyCycle(String cycleType){
        if(cycleType.equalsIgnoreCase("Unicycle")){
            return new Unicycle();
        }else if(cycleType.equalsIgnoreCase("Bicycle")){
            return new Bicycle();
        } else if (cycleType.equalsIgnoreCase("Tricycle")) {
            return new Tricycle();
        }
        return null;
    }
}