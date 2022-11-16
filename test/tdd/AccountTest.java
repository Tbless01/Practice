package tdd;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
    Account deborahAccount = new Account(); //given there is an account

        deborahAccount.deposit(5000); // when I deposit 5000

        int deborahAccountBalance = deborahAccount.getBalance();//check that balance is 5000
        assertEquals(5000, deborahAccountBalance);
    }



        @Test
        public void depositTwiceTest() {
            // given there is an account
            Account deborahAccount = new Account();
            // given that initial balance is 4000
            deborahAccount.deposit(4000);
            // when i deposit 2000
            deborahAccount.deposit(2000);
            // check that balance is 60000
            int deborahAccountBalance = deborahAccount.getBalance();
            assertEquals(6000, deborahAccountBalance);

        }


        @Test
        public void depositNegativeAmountTest() {
            // given there is an account
            Account deborahAccount = new Account();
            // given that initial balance is 4000
            deborahAccount.deposit(4000);
            // when i deposit -2000
            deborahAccount.deposit(-2000);
            // check that balance remains the initial balance 40000
            int deborahAccountBalance = deborahAccount.getBalance();
            assertEquals(4000, deborahAccountBalance);

    }


@Test
    public void withdrawalFirstAmountTest(){
    // given there is an account
     Account deborahAccount = new Account();
    // given that initial balance is 15000
     deborahAccount.deposit(15000);
    // when I withdraw 4000
     deborahAccount.withdraw(4000);
    // check that balance remains the initial balance 11000
     int deborahAccountBalance = deborahAccount.getBalance();
     assertEquals(11000, deborahAccountBalance);


}

@Test
    public void negativeWithrawal(){
        Account deborahAccount = new Account();
        deborahAccount.deposit(30000);
        deborahAccount.withdraw(20000);
        deborahAccount.withdraw(40000);
        deborahAccount.deposit(10000);
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(20000, deborahAccountBalance);
    }




    }
