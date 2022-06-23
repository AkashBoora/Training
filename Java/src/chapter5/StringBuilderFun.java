package chapter5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Akash Boora");

        stringBuilder.append(" is awesome");
        System.out.println(stringBuilder);

        stringBuilder.insert(0, "Vamshi ");
        System.out.println(stringBuilder);

        stringBuilder.replace(0,6, "Hello,");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,7);
        System.out.println(stringBuilder);

        stringBuilder.replace(0,5,"Dr.");
        System.out.println(stringBuilder);
    }
}
