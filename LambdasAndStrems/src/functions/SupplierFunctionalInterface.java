package functions;

import lambdas.Trade;

import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<String []> fruitSupplier = () -> new String[]{"Apple", "Orange"};

    Supplier<List<Trade>> tradeSupplier = () -> TradeUtil.createTades();

    private void testSupplier(){
        String[] fruits = fruitSupplier.get();
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        List<Trade> list = tradeSupplier.get();
        for(Trade t: list){
            System.out.println(t);
        }
    }
}
