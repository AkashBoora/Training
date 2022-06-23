package lambdas;

import java.util.concurrent.Callable;

public class Runnables {
    public void  methodAcceptingRunnable(Runnable runnable){
        runnable.run();
    }

    public void methodAcceptingCallable(Callable callable) throws Exception {
        callable.call();
    }


    public static <Trade> void main(String[] args) throws Exception {
        Runnable runnable = () -> System.out.println("Hello, Lambda");

        new Runnables().methodAcceptingRunnable(runnable);

        new Runnables().methodAcceptingRunnable(() ->{
            System.out.println("Hello, Lambda");
            persist();
            email();
        } );

        Callable callable = () -> "Hello, callable";
        new Runnables().methodAcceptingCallable(callable);

    }



    private static void email() {
    }

    private static void persist() {
    }
}
