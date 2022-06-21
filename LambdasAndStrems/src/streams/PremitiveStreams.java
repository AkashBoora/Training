package streams;

import functions.TradeUtil;
import lambdas.Trade;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PremitiveStreams {
    List<Trade> trades = TradeUtil.createTades();

    private void tradeQuantity(){
        Optional<Integer> sum = trades.stream().map(Trade::getQuantity).reduce(Integer::sum);
    }

    private void intStream(){
        int[]  ints = new int[]{2,4,6,8,10};
        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.of(2,4,6,8);
        intStream.forEach(System.out::println);
    }

    private void convertStreams(){
        int tradeStreamSum = trades.stream().mapToInt(Trade::getQuantity).sum();
    }
}
