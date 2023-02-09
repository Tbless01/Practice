package BankApp;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private final String accountName;
    private final int accountNumber;
    private String pin;


    public Account(String accountName, int accountNumber, String accountPin) {
        this.pin = accountPin;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    //    public BigDecimal getBalance(String pin) throws Exception{
//        if(!pin.equals(this.pin)) throw new IllegalAccessException("Invalid Pin");
//        return balance;
//    }

    public BigDecimal getBalance(String pin) {
        validate(pin);
        return balance;
    }

    public void validate(String pin) {
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
    }

    public void withdraw(BigDecimal amount, String pin) {
        validate(pin);
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return String.format("""
                ======================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                ======================
                """, accountName, accountNumber, balance.toPlainString());
    }
}


