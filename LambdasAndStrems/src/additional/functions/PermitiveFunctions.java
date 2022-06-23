package additional.functions;

import functions.Movie;

import java.util.function.*;

public class PermitiveFunctions {
    Predicate<Integer> evenNumberPredicate = x -> x%2==0;
    IntPredicate evenNumberPredicate2 = x -> x%2 ==0;

    DoublePredicate doublePredicate = i -> i<10;

    //Consumers
    IntConsumer intConsumer = null;
    DoubleConsumer doubleConsumer = null;

    //Suppliers
    IntSupplier intSupplier;
    DoubleSupplier doubleSupplier;

    //Functions
    IntFunction<Movie> movieIntFunction = null;
    DoubleToIntFunction doubleToIntFunction;


    private void  testPredicate(int i){
        System.out.println("Even Number? "+evenNumberPredicate2.test(i));
    }

    public static void main(String[] args) {
        int num = 45;
        new PermitiveFunctions().testPredicate(45);
    }
}
