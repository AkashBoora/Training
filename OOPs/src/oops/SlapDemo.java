package oops;

public class SlapDemo {
    public static void main(String[] args) {
        getDetailsAndMail();

    }
//    public void getDetailsAndMail(){
//        System.out.println("Fetching details from database");
//        System.out.println("Mailing to the user");
//    }
    public static void getDetailsAndMail(){
        System.out.println("Fetching details from database");
        String details = "Details";
        emailTheUser(details);
    }
    public static void emailTheUser(String details){
        System.out.println("Mailing to the user"+details);

    }
}
