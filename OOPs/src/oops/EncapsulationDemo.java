package oops;
class Account{
    private double balance;

    public double getBalance() {
        //validations can be added
        return this.balance;
    }

    public void setBalance(double balance) {
        //validations can be added
        this.balance = balance;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(8098097);
        System.out.println(account.getBalance());
    }
}
