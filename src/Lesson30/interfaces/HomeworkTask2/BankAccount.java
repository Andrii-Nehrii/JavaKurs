package Lesson30.interfaces.HomeworkTask2;

public class BankAccount implements Paymentsystem {
    public double balance = 100;

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "EUR. Balance: " + balance+ "EUR");
        } else {
            System.out.println("invalid amount.");
        }
    }


    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + "EUR. BAlance: " + balance+ "EUR");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public double chekBalance() {
    return balance;
    }
}