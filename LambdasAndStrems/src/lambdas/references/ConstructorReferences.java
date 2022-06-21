package lambdas.references;

public class ConstructorReferences {
    class Movie{
        public Movie(int id){

        }

        public Movie(int id, String name){

        }
    }

    interface MovieFactory{
        public Movie create(int id);
    }

    interface MovieFactory2{
        public Movie create(int id, String name);
    }

    MovieFactory m1 = i->new Movie(i);
    MovieFactory m2 = Movie::new;
    MovieFactory2 m3 = Movie::new;

    public static void main(String[] args) {
        ConstructorReferences ref = new ConstructorReferences();
    }
}
