package main.java.ru.avtohacker23;

public class Account {

    private long balance;
    private int accNumber;
    private boolean isBlocked = false;

    public Account(int accNumber, long balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public boolean withdrawMoney(long money) {
        if (balance >= money) {
            balance -= money;
            return true;
        }
        return false;
    }

    public void putMoney(long money) {
        balance += money;
    }

    public void blockAccount() {
        isBlocked = true;
    }
}