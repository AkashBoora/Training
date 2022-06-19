package chapter2.operators;

public class RelationalFUn {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge =37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("myBool is "+myBool);
        System.out.println("yourBool is"+yourBool);

        //Relational Comparisons
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: "+ ageComparison);

        ageComparison = yourAge < bobsAge;
        System.out.println("yourAge < bobsAge?: "+ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: "+ageComparison);

        String myName = "Akash";
        String yourName = "Akash";

        boolean nameComparison = myName.equals(yourName);
        System.out.println("Does name match?: "+nameComparison);

        int currentAge = 22;
        boolean isGreterOrEqual21 = currentAge >= 21;
        System.out.println("currentAgs >= 21?: "+isGreterOrEqual21);
    }
}
