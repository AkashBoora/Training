package oops;

class Vehicle{
    public  void run(){
        System.out.println("Vehicle is running");
    }
}

class Car extends  Vehicle{
    public void run(){
        System.out.println("Car is running");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        Car c = new Car();
        c.run();
        Vehicle car = new Car();
        car.run();
    }

}
