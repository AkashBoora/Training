package lambdas.references;

interface IMovie{
    public boolean check(int id);
}

public class MethodReference {
    public void  testMovieStaticMethodRef(){
        IMovie m1 = i -> i<100;
        IMovie m2 = MethodReference::isClassic;
    }

    public static boolean isClassic(int movieId){
        return true;
    }

    public static void main(String[] args) {
        MethodReference reference = new MethodReference();
        IMovie m1 = i-> i>10 && i<100;
        IMovie m2 = reference::isTop10;
    }

    private void testMovieArbitaryObjectMethod(){
        IMovie m1 = SomeMethodReferences::isComedy;
    }
    private boolean isTop10(int i) {
        return true;
    }
}

class  SomeMethodReferences{
    public static boolean isComedy(int i){
        return false;
    }
}
