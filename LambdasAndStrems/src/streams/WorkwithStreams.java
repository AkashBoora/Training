package streams;

import functions.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class WorkwithStreams {
    List<Movie> movies = MovieUtil.createMovies();

    public void findMoviesByDirector(String stephen_spielberg) {
        movies.stream()
                .filter(m->m.getDirector().equals("Stephen Spielberg"))
                .map(Movie::getName)
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new WorkwithStreams().findMoviesByDirector("Stephen Spielberg");
    }
}
