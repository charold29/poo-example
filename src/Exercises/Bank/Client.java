package Exercises.Bank;

public class Client {
    private final String name;
    private final String lastname;
    private final String dni;
    private final Account[] accounts;

    public Client(String name, String lastname, String dni, Account[] accounts) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDni() {
        return dni;
    }

    public double consultMoney(int n){
        return accounts[n].getBalance();
    }

    public void depositMoney(int n, double balance){
        accounts[n].depositMoney(balance);
    }

    public void withdrawMoney(int n, double balance){
        accounts[n].withdrawMoney(balance);
    }
}
