package Exercises.Bank;

public class Account {
    private final int idAccount;
    private double balance;

    public Account(int idAccount, double balance) {
        this.idAccount = idAccount;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double amount){
        balance += amount;
    }

    public void withdrawMoney(double amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", balance= HIDDEN" +
                "}\n";
    }
}
