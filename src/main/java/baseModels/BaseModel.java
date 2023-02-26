package baseModels;

public abstract class BaseModel {

    private int balance;
    private String currency;
    private String name;

    public BaseModel(int balance, String currency, String name) {
        this.balance = balance;
        this.currency = currency;
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
