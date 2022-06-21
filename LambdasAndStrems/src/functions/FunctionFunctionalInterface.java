package functions;

import lambdas.Trade;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterface {

    List<Trade> list = TradeUtil.createTades();
    Function<String, Movie> createMovie = s -> new Movie(s);

    private void testFunction(String movieName){
        Movie movie = createMovie.apply(movieName);
        System.out.println("Movie is: "+movie);

        Function<Integer,Trade> tradeFinder = id -> {
            for(Trade trade: list){
                if(trade.getID()==id)
                    return trade;
            }
            return new Trade();
        };
    }

    public static void main(String[] args) {
        new FunctionFunctionalInterface().testFunction("God Must be crazy");
    }
}