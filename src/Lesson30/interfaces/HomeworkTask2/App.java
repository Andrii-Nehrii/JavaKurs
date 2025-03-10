package Lesson30.interfaces.HomeworkTask2;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println( bankAccount.chekBalance());
        bankAccount.depositTransfer(1000);
        bankAccount.withdrawMoney(600);
        System.out.println( bankAccount.chekBalance());
        ElectronickWallet electronickWallet = new ElectronickWallet();
        System.out.println(electronickWallet.chekBalance());
        electronickWallet.withdrawMoney(-1);
        electronickWallet.depositTransfer(-1);
        electronickWallet.withdrawMoney(500);

        electronickWallet.depositTransfer(1000);
        electronickWallet.withdrawMoney(500);
        System.out.println(electronickWallet.chekBalance());
    }
}
