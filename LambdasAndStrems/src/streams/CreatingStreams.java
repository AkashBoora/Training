package streams;

import functions.Movie;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamFromValues();
        new CreatingStreams().testCollectionStream();
    }

    private void testCollectionStream() {
        List<Movie> movies = MovieUtil.createMovies();

        movies.stream().forEach(System.out::println);
    }

    private void testStreamFromValues() {
        Stream<String> movieNames = Stream.of("Gods must be crazy", "Fiddler On the roof");
        System.out.println(movieNames.count());

        String[] movieNames2 = {"Gods must be crazy", "Fiddler On the roof"};

        Stream<String> mNames2 = Stream.of(movieNames2);
    }

    private void testEmptyStreams() {
        Stream<Movie> movieEmptyStream = Stream.empty();
    }
}
