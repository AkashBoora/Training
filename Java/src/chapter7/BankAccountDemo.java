package chapter7;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Akash Boora",8900);
        BankAccount bobsAccount = new BankAccount("Bob Robinson");

        bobsAccount.deposit(500);
        System.out.println("Balance "+bobsAccount.getBalance());

        bobsAccount.withdraw(1000);
        System.out.println("Balance "+bobsAccount.getBalance());


        System.out.println("Owner "+bobsAccount.getOwnerName());

        System.out.println();

        System.out.println(myAccount.getOwnerName());
        System.out.println("Balance "+myAccount.getBalance());
        myAccount.withdraw(900);
        System.out.println("Balance "+myAccount.getBalance());

    }
}
