package stream.common.operations;

import functions.TradeUtil;
import lambdas.Trade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    List<Trade> tradeList = TradeUtil.createTades();
    List<Integer> ints = Arrays.asList();

    public static void main(String[] args) {
        new Reducing().schoolStaff();
        new Reducing().tradeQuantitySum();
        new Reducing().tradeInstrumentList();
    }

    private void tradeInstrumentList() {
        Optional<String> instList = tradeList.stream().map(Trade::getInstrument).reduce((a, b)->a+" "+b);
    }

    private void tradeQuantitySum() {
        Optional<Integer> instList = tradeList.stream().map(Trade::getQuantity).reduce((a, b)->a+b);
    }

    private void schoolStaff() {
        ints = Arrays.asList(11,12,12,15);
        int staff = ints.stream().reduce(10,(i,j) -> i+j);
    }
}
