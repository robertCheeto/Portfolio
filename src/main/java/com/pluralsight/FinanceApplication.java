package com.pluralsight;
import com.pluralsight.models.*;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Dan Spez", "12345", 5000);
        Valuable acc1 = new BankAccount("Tom Cruise", "67890", 200);

        System.out.println("Bank1's Balance: " + bank1.getBalance());
        bank1.deposit(100);
        System.out.println("Bank1's Balance: " + bank1.getBalance());

        acc1.getValue();
        //acc1.deposit(); | method will not work because Valuable does
        // not have those methods within that class


    }
}
