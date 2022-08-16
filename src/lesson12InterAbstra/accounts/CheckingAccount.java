package lesson12InterAbstra.accounts;

public class CheckingAccount extends Account {
    int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.balance - amount < 0) {
            //Проверка на достаточное количество средств на счёте
            System.out.println("Не достаточно средств на счете.");
            System.out.println();
        } else if (account.addMoney(amount) == 0) {
            System.out.println("Перевод не возможен.");
            System.out.println();
        } else {
            balance -= amount;
        }
    }

    @Override
    public int addMoney(int amount) {
        return this.balance += amount;
    }

    @Override
    public void showBalance() {
        System.out.println("Балланс расчетного счета: " + balance);
        System.out.println();
    }

    @Override
    public void pay(int amount) {
        if (this.balance - amount < 0) {
            //Проверка на достаточное количество средств на счёте
            System.out.println("Не достаточно средств на счёте.");
            System.out.println();
        } else {
            System.out.println("Оплата со счета на сумму: " + amount);
            System.out.println();
            this.balance -= amount;
        }
    }
}