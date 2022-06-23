package streams;

import functions.Movie;

import java.util.List;
import java.util.stream.Stream;

public class LazyAndEagerStreams {

    List<Movie> movieList = MovieUtil.createMovies();


    public static void main(String[] args) {
        new LazyAndEagerStreams().testLazy();
        new LazyAndEagerStreams().testEager();
    }

    private void testEager() {
        Stream<Movie> movieStream= movieList.stream().filter(m -> {
            System.out.println("Inside lazy operation");
            return m.isClassic();
        }).map(s-> {
            System.out.println("Mapping");
            return s;
        });
    }

    private void testLazy() {
        movieList.stream().filter(m -> {
            System.out.println("Inside lazy operation");
            return m.isClassic();
        }).count();
    }
}
