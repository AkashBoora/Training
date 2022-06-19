package chapter3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 15;
        if(age >= 16){
            System.out.println("You can drive");
        }else{
            System.out.println("You can not drive");
        }

        for(int i=age;i<=40;i++){
            if(i%10==1){
                System.out.println("Happy "+i+"st Birthday");
            }else if(i%10 ==2){
                System.out.println("Happy "+i+"nd Birthday");
            }else if(i%10 ==3){
                System.out.println("Happy "+i+"rd Birthday");
            }else{
                System.out.println("Happy "+i+"th Birthday");
            }
        }

    }
}
