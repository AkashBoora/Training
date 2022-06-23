package chapter3;

public class EvenOnly {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%2==1)
                continue;
            System.out.print(i+"\t");
        }
    }
}
