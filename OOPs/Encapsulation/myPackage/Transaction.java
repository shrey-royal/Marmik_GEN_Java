package myPackage;
import myPackage.BankAccount;

public class Transaction {
    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if(fromAccount.getBalance()-2000 >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer of " + amount + " from " + fromAccount.getAccountHolder() + " to " + toAccount.getAccountHolder() + " Successful.");
        } else {
            System.out.println("Transfer Failed. Insufficient funds in the sender's account.");
        }
    }
}
