package functions;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m-> System.out.println("Print movie info " +m);

    Consumer<Movie> persistMovie = m-> persist(m);

    Consumer<Movie> notifyMovie = m-> notify(m);

    private void persist(Movie m) {
        System.out.println("Persisting movie "+m);
    }

    private void notify(Movie m){
        System.out.println("Notifing "+m);
    }
    private  void  testConsumer(Movie movie){
        printInfo.accept(movie);
        persistMovie.accept(movie);
    }

    public  void testAndThen(Movie movie){
        Consumer<Movie> printAndPersistMovie = printInfo.andThen(persistMovie);
        printAndPersistMovie.accept(movie);
        Consumer<Movie> chainedCombine = notifyMovie.andThen(persistMovie).andThen(printInfo);
        chainedCombine.accept(movie);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Gods Must Be crazy");
        new ConsumerFunctionalInterface().testConsumer(movie);
        new ConsumerFunctionalInterface().testAndThen(movie);
    }
}


