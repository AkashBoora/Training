package chapter2.operators;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int sum = b+a;
        int difference = b-a;
        int product = b*a;
        int quotient = b/a;
        int remainder = b%a;

        System.out.println("The sum is: "+sum);
        System.out.println("The difference is: "+difference);
        System.out.println("The product is: "+product);
        System.out.println("The quotient is: "+quotient);
        System.out.println("The remainder is: "+remainder);
        System.out.printf("");

        //Compound arithmetic chapter2.operators

        sum +=20;
        difference -=1;
        product *=2;
        quotient /=2;
        remainder %=3;

        System.out.println("The sum is: "+sum);
        System.out.println("The difference is: "+difference);
        System.out.println("The product is: "+product);
        System.out.println("The quotient is: "+quotient);
        System.out.println("The remainder is: "+remainder);

        // Increment / Decrement

        int i =20;
        System.out.println(i++); //post increment
        System.out.println(++i); //pre increment
        System.out.println(i--); // post decrement
        System.out.println(--i); //pre decrement
    }
}
