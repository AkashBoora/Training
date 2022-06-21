package stream.common.operations;

import functions.TradeUtil;
import lambdas.Trade;

import java.util.List;
import java.util.Optional;

public class Finder {
    List<Trade> trades = TradeUtil.createTades();

    public static void main(String[] args) {
        new Finder().testFindFirst();
        new Finder().testFindAny();
        new Finder().testAnyMatch();
        new Finder().testAllMatch();
        new Finder().testNoneMatch();
    }

    private void testNoneMatch() {
        boolean cancelledTrade = trades.stream().noneMatch(Trade::isCancelled);
    }

    private void testFindAny() {
        Optional<Trade> firstAny = trades.stream().filter(Trade::isBigTrade).findAny();
        // random search, parallel
    }

    private void testAllMatch() {
        boolean rottenTrade = trades.stream().allMatch(t-> t.getStatus().equals("ROTTEN"));
    }

    private void testAnyMatch() {
        boolean rottenTrade = trades.stream().anyMatch(t-> t.getStatus().equals("ROTTEN"));
        //checks any match is there or not
    }

    private void testFindFirst() {
        Optional<Trade> firstTrade = trades.stream().filter(Trade::isBigTrade).findFirst();
        // returns first big trade
    }
}
