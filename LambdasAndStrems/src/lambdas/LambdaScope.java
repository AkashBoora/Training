package lambdas;

public class LambdaScope extends SuperScope{
    private String member  = "GRANDPA";

    interface Family{
        String who (String member);
    }

    public void testMember(String member){
        System.out.println("Local Member: "+member);
        System.out.println("Family Member: "+this.member);
        System.out.println("Family Member: "+super.member);

        Family familyLambda = (familyMember) -> {
            System.out.println("Local Lambda Member: "+familyMember);
            System.out.println("Local Lambda Member: "+member);
            System.out.println("Family Lambda Member: "+this.member);
            System.out.println("Family Lambda Member: "+super.member);
            return familyMember;
        };

        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("SON");
    }
}
