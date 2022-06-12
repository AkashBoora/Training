package oops;

class House{
    private Kitchen kitchen;
    public House(){
        kitchen = new Kitchen();
        kitchen.setFood("Biryani");
    }

    public String getFood(){
        return kitchen.getFood();
    }
}

class  Kitchen{
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
public class CompositionDemo {
    public static void main(String[] args) {
        House house = new House();
        house.getFood();
    }
}
