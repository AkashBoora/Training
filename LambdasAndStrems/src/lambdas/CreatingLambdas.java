package lambdas;

public class CreatingLambdas {
    interface  Greeting{
        public  String sayHello(String name);
    }

    public void testGreeting(String name, Greeting g){
        String result = g.sayHello(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //inputs -> body
        new CreatingLambdas().testGreeting("Akash", (String name)->"Hello,"+name);

        new CreatingLambdas().testGreeting("Akash",
                (String name) -> !name.isEmpty() ? "Hello,"+name : "Did you miss something");

    }
}
