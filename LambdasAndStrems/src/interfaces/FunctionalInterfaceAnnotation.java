package interfaces;

public class FunctionalInterfaceAnnotation {
    @FunctionalInterface
    interface  Cruncher{
        int crunch(int i, int j);
    }

    public int crusherService(int i, int j, Cruncher cruncher){
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation functionalInterface = new FunctionalInterfaceAnnotation();
        int ans = functionalInterface.crusherService(3,6, (p,q) -> p*q);
        System.out.println(ans);

        ans = functionalInterface.crusherService(3,6, (p,q) -> p+q);
        System.out.println(ans);
    }
}
