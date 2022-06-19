package chapter7;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Choloate",3,2);
        IceCream yourIcecream = new IceCream("Straerry",1,3);

        myIceCream.addTopping("nuts");
        myIceCream.addTopping("cherries");

        yourIcecream.addTopping("sprinkles");

        printIceCream(myIceCream);
        printIceCream(yourIcecream);
    }

    public static void printIceCream(IceCream iceCream){
        System.out.println(iceCream.getName()+
                "\nCost: $"+iceCream.getCost()+
                "\nTopped with");
        iceCream.printToppings();
        System.out.println();
        System.out.println();
    }
}
