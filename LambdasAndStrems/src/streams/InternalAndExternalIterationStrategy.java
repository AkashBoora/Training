package streams;

import functions.Movie;

import java.util.ArrayList;
import java.util.List;

public class InternalAndExternalIterationStrategy {
    List<Movie> movies = MovieUtil.createMovies();
    List<Movie> top2Classics = new ArrayList<>();

    private  void testExternalIeration(){
        for(Movie movie:movies){
            if(movie.isClassic()){
                top2Classics.add(movie);
            }
        }

        System.out.println("Top 2classics"+top2Classics);
    }

    private  void testInternalIeration1(){
        movies.stream().filter(Movie::isClassic).map(Movie::getName).forEach(System.out::println);
    }

}
