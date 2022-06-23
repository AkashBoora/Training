package chapter3;
import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;

        randomNumber = random.nextInt();
        System.out.println(randomNumber);

        randomNumber = random.nextInt(2000);
        System.out.println(randomNumber);

        randomNumber = random.nextInt(1000)+1;
        System.out.println(randomNumber);
    }
}
