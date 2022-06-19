package chapter7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle unitCircle = new Circle();
        Circle myCirlce = new Circle(5);
        Circle yourCycle = new Circle(7);

        printCircleData(unitCircle);
        printCircleData(myCirlce);
        printCircleData(yourCycle);
    }

    public static void printCircleData(Circle circle){
        System.out.println("r= "+circle.getRadius()
        +"\nC= "+String.format("%.2f",circle.circumference())
        +"\nA= "+String.format("%.2f",circle.area()));
        System.out.println();
    }
}
