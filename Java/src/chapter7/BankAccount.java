package chapter7;

public class BankAccount  {
    private String ownerName;
    private int balance;

    public BankAccount(String name){
        this(name,0);
    }
    public BankAccount(String name, int balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount > 0)
            balance+=amount;
        else
            System.out.println("Amount to deposit must be greater than 0");
    }

    public  void  withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance-=amount;
        }else
            System.out.println("The amount to withdraw must be greater that 0 and less than balance");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public  int getBalance(){
        return balance;
    }
}
