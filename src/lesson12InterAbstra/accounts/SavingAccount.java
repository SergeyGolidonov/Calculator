package lesson12InterAbstra.accounts;

public class SavingAccount extends Account {
    int balance;

    public SavingAccount(int balance) {
        this.balance = balance;
    }

    // Метод производит перевод на другой счёт
    @Override
    public void transfer(Account account, int amount) {
        // Если средств на счёте не достаточно, перевод не будет осуществлен
        if (this.balance - amount < 0) {
            //Проверка на достаточное количество средств на счёте
            System.out.println("Не достаточно средств на счете.");
            System.out.println();
            // Если перевод не возможет по причине принимающего перевод счёта, перевод не будет осуществлен
        } else if (account.addMoney(amount) == 0) {
            System.out.println("Перевод не возможен.");
            System.out.println();
        } else {
            // Если условия позволяют, перевод будет осуществлен
            balance -= amount;
        }
    }

    // Метод добавления средств на счёт
    @Override
    public int addMoney(int amount) {
        System.out.print("После добавления средств ");
        System.out.println();
        return this.balance += amount;
    }

    // Простой метод показать баланс счёта
    @Override
    public void showBalance() {
        System.out.println("Балланс сберегательного счета: " + balance);
        System.out.println();
    }

    // Метод оплаты со счёта (в данном случае оплата будет не возможна по условию задачи)
    @Override
    public void pay(int amount) {
        if (amount != 0) {
            System.out.println("Оплата с данного счёта не возможна.");
            System.out.println();
        }
    }
}