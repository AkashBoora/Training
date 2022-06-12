package basics;

class Fan{
    public boolean isOn; // instance variables
    public  static int staticVar;// static keyword

//    Fan(){ //Non Parameterized
//        this.isOn=false;
//    }

    Fan(boolean isOn){
        this.isOn=isOn;
    }

    public void turnOn(){
        int var =0; //local variables
        isOn = true;
        System.out.println("Fan is Spinnning");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is Stop");
    }
    //methods turnOn and turnOff are behaviours. variable isOn is state.
}

public class Demo {
    public static void main(String[] args) {
        Fan fan = new Fan(true);
        // creating object fan using class Fan.
        fan.turnOn();
        fan.staticVar=90;

        Fan yourFan = new Fan(false);
        yourFan.isOn= true;
        System.out.println(yourFan.staticVar);
    }

}
