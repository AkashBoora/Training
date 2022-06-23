package lambdas;

public class TargetType {
    interface Email{
        String constructsEmail(String name);
    }

    Email email = name -> name + "@google.com";

    public String  getEmail (String name, Email email){
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("Akash", name -> name + "@google.com");
    }
}
