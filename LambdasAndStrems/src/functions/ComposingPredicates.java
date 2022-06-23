package functions;

import lambdas.Trade;

import java.util.List;
import java.util.function.Predicate;

public class ComposingPredicates {
    private  void testPredicates(Trade trade){
        Predicate<Trade> bigTrade = t -> t.isBigTrade();
        Predicate<Trade> cancelledTrade = t -> t.isCancelled();
        Predicate<Trade> cancelledBigTrade = t -> t.isCancelled() && t.isBigTrade();
        Predicate<Trade> cancelledBigTrade2 = bigTrade.and(cancelledTrade);
        Predicate<Trade> cancelledOrBigTrade = bigTrade.or(cancelledBigTrade);

        Predicate<Trade> issuerTrade = t-> t.getInstrument.equals("Goog");
        Predicate<Trade> bingCancelledTradeForGoogleIssuer = cancelledBigTrade2.and(issuerTrade);

        Predicate<Trade> notACancelledTrade = cancelledTrade.negate();

        List<Trade> trades = TradeUtil.createTades();

        Trade t1 = new Trade();

        Predicate<Trade> p1 = Predicate.isEqual(t1);

        for(Trade t : trades){
            if(p1.test(t))
                System.out.println("Matching trade "+t);
        }



    }
}
