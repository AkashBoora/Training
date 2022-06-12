package oops;

class BankAccount{
    private double balance = 100000;
    private String userName = "basicStrong";
    private String password = "password";

    public  double getAccountBalance(String  userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            return balance;
        }else
            return 0.0;
    }
}

public class AccessAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        double bal = account.getAccountBalance("basicStrong", "password");
        System.out.println(bal);
    }
}
