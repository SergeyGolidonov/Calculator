package lesson12InterAbstra;

import lesson12InterAbstra.accounts.Account;
import lesson12InterAbstra.accounts.CheckingAccount;
import lesson12InterAbstra.accounts.CreditAccount;
import lesson12InterAbstra.accounts.SavingAccount;

public class Main {
    //Создаём 3 переменные типа Account
    public static Account saving;
    public static Account credit;
    public static Account checking;

    public static void main(String[] args) {

        //Заполняем экземпляры, согласно конструкторам.
        saving = new SavingAccount(10_000);
        //Т.к. в задаче не указано, что кредитный счёт имеет лимит, он будет безлимитным со стартовой суммой 0.
        credit = new CreditAccount();
        checking = new CheckingAccount(10);

        //Демонстрация работы методов классов наследников абстрактного класса
        //После каждого выполнения методов будем выводить баланс счёта, что бы убедиться в правильности работы программы
        //Оплата со сберегательного счёта не возможна
        System.out.println("Оплата со сберегательного счёта не возможна");
        saving.pay(250);
        saving.showBalance();
        //Метод добавляет сумму на счёт
        System.out.println("Метод добавляет сумму на счёт");
        saving.addMoney(350);
        saving.showBalance();
        //Метод делает перевод на другой счёт (успешный пример)
        System.out.println("Метод делает перевод на другой счёт (успешный пример)");
        saving.transfer(checking, 1590);
        saving.showBalance();
        checking.showBalance();
        //Метод делает перевод на другой счёт (безуспешный вариант)
        System.out.println("Метод делает перевод на другой счёт (безуспешный вариант)");
        saving.transfer(credit, 20);
        //Т.к. баланс кредитного счёта не может быть больше 0, перевод не пройдет.
        //Сумма сберегательного счёта, при этом, не изменится
        saving.showBalance();
        System.out.println("Перевод с кредитного счёта");
        credit.transfer(checking, 1500);
        credit.showBalance();
        System.out.println("Пополнение кредитного счёта больше, чем нужно");
        credit.addMoney(1501);
        System.out.println("Пополнение не получится по условию задачи.");
        credit.showBalance();

        System.out.println("ДАЛЕЕ НЕ БУДУ ДЕМОНСТРИРОВАТЬ РАБОТУ ПРОГРАММЫ, ВСЁ РАБОТАЕТ.");

    }
}