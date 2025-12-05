package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Does Deposit / Withdraws from the account and throws execptions for stupid stuff like balance <=0...
 * the exercise forced me it held a gun against me head... just jocking
 * @author Giannis
 * @version 1.0.0
 */

public class SimpleBank {
    static double balance = 500;
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        double amount;
        while (run) {
            System.out.print("Select 1 to Deposit an amount or 2 to Withdraw an ammount  or 0 to Exit: ");
            int option = reader.nextInt();
            switch (option) {
                case 0 :
                    run = false;
                    break;
                case 1 :
                    try {
                        System.out.print("Insert amount you wish to Deposit: ");
                        amount = reader.nextInt();
                        deposit(amount);
                    } catch (Exception e) {
                        System.out.println("Invalid Deposit amount");
                    }
                    break;
                case 2 :
                    try {
                        System.out.print("Insert amount you wish to Withdraw: ");
                        amount = reader.nextInt();
                        withdraw(amount);
                    } catch (Exception e) {
                        System.out.println("Invalid Withdraw amount");
                    }
            }


        }
    }

    /**
     * Checks if the Deposit amount is neg if yes throws Exception if no it adds to Balance
     * @throws Exception if amount is negative
     */

    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("The Deposit amount can't be negative");
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }

    /**
     * Checks if the Balance is 0 or neg or if the amount to Withdraw is bigger than the current balance or neg
     * in either case an Exception is thrown if neither then the Withdrawal happens and balance is reduced by amount
     * @param amount amount to Withdraw
     * @throws Exception
     */

    public static void withdraw(double amount) throws Exception {
        try {
            if (balance <= 0) throw new Exception("Can't Withdraw from an empty account");
            if (amount < 0) throw new Exception("Withdraw amount can't be negative");
            if (amount > balance) throw new Exception("Amount to Withdraw is bigger than the available balance");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }
}
