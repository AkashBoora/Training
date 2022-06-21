package interfaces;

interface Animal{
    default String name(){
        return "Animal";
    }
}

interface Bird{
    default String name(){
        return "Bird";
    }
}

class Bat implements Animal, Bird{
    @Override
    public String name() {
        return Animal.super.name();
    }
}
public class MultipleInherritance {
}
