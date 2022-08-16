package lesson12InterAbstra.accounts;

public abstract class Account {

    public abstract void transfer(Account account, int amount);

    public abstract int addMoney(int amount);

    public abstract void showBalance();

    public abstract void pay(int amount);
}