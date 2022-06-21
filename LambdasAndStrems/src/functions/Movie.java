package functions;

public class Movie {
    public String name;
    public String director;

    Movie(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName(){
        return name;
    }

    public Object getDirector() {
        return director;
    }

    public boolean isClassic() {
        return true;
    }
}
