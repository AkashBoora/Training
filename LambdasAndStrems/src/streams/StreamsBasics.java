package streams;

import functions.TradeUtil;
import lambdas.Trade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics {
    private List<Trade> findLargeTradeUsingPreJava8(List<Trade> trades){
        List<Trade> largeTrades = new ArrayList<>();
        for(Trade trade : trades){
            if (trade.getQuantity()>10000)
                largeTrades.add(trade);
        }
        return largeTrades;

    }

    private List<Trade> findLargeTradeUsingStreams(List<Trade> trades){
        List<Trade> largeTrades = trades.parallelStream()
                .filter(trade -> trade.getQuantity() > 10000)
                .collect(Collectors.toList());
        return  largeTrades;
    }


    public static void main(String[] args) {
        StreamsBasics basics = new StreamsBasics();
        List<Trade> trades = TradeUtil.createTades();
        basics.findLargeTradeUsingStreams(trades);
    }

}
