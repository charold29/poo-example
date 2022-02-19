package Exercises.Bank;

public class Account {
    private final int idAccount;
    private double balance;

    public Account(int idAccount, double balance) {
        this.idAccount = idAccount;
        this.balance = balance;
    }

    public int getIdAccount() {
        return idAccount;
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
}
