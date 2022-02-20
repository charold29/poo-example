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

    public Account[] getAccounts() {
        return accounts;
    }
}
