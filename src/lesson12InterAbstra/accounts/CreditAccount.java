package lesson12InterAbstra.accounts;

public class CreditAccount extends Account {
    int balance;

    public CreditAccount() {
        this.balance = 0;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.balance - amount >= 0) {
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
        if ((this.balance + amount) > 0) {
            System.out.println("Баланс кредитного счета не может быть больше нуля.");
            System.out.println();
            return 0;
        } else {
            return this.balance += amount;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Балланс кредитного счета: " + balance);
        System.out.println();
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата со счета на сумму: " + amount);
        System.out.println();
        this.balance -= amount;
    }
}