package interfaces;

public class FunctionalInterFaces {
    @FunctionalInterface
    interface Mulitiplier{
        int multiply(int i, int j);
    }

    Mulitiplier mulitiplier = (p,q) -> p*q;
    public static void main(String[] args) {
        FunctionalInterFaces client = new FunctionalInterFaces();
    }
}
