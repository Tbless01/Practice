package BankApp;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(firstName + " " + lastName, accountNumber, pin);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber - 1);
    }

    public BigDecimal checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void depositInto(int accountNumber, BigDecimal amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
//        or findAccount(accountNumber).deposit(amount);
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
//        or findAccount(accountNumber).deposit(amount);
    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);
    }

    public void accountDelete(int accountNumber) {
        accounts.remove(accountNumber-1);
    }
}
