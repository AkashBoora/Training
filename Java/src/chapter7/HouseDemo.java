package chapter7;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(5,8,"Blue");

//        System.out.println("My house is "+myHouse.getColour()+" and has "+myHouse.getNumStories()+" stories and "+myHouse.getNumWindows()+" windows.");
//        System.out.println("Your house is "+yourHouse.getColour()+" and has "+yourHouse.getNumStories()+" stories and "+yourHouse.getNumWindows()+" windows.");

        printHouseData(myHouse);
        printHouseData(yourHouse);
    }

    public static void printHouseData(House house){
        System.out.println("The house is "+house.getColour()+" and has "+house.getNumStories()+" stories and "+house.getNumWindows()+" windows.");


    }
}
