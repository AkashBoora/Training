package stream.common.operations;

import functions.Movie;
import functions.TradeUtil;
import lambdas.Trade;
import streams.MovieUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Collecting {
    List<Trade> trades = TradeUtil.createTades();

    public static void main(String[] args) {
        new Collecting().collectingIntoAList();
        new Collecting().collectingIntoASet();
        new Collecting().collectingIntoToMap();
    }

    private void collectingIntoToMap() {
        List<Trade> tradeList = trades.stream().collect(Collectors.toList());
    }

    private void collectingIntoASet() {
        Set<Trade> tradeSet = trades.stream().collect(Collectors.toSet());
    }

    private void collectingIntoAList() {
        List<Movie> movies = MovieUtil.createMovies();

        Map<String,Movie> movieMap = movies.stream().collect(toMap(Movie::getName, movie->movie));
    }
}
