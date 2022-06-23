package interfaces;

interface Engine{
    default  String make(){
        return  "Default Make";
    }
}

interface  Vehicle{
    default String model(){
        return "Default Model";
    }
}

class Car implements Engine, Vehicle{
    String makeAndModel(){
        return Engine.super.make()+Vehicle.super.model();
    }
}
public class InheritingBehaviour {
    public static void main(String[] args) {

    }
}
