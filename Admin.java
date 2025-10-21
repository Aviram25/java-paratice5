package day4hrs;

// Class to demonstrate account operations with exception handling
public class Admin {

    // Main method to test deposit and withdrawal operations with exception handling
    public static void main(String[] args) {
        // Test case 1: Attempt to deposit a negative amount
        try {
            // Create an account for "Rohan" with initial balance 0
            Account a = new Account("Rohan");
            // Attempt to deposit a negative amount, which should throw NegativeDeposit exception
            a.deposit(-100);
        } catch (NegativeDeposit n) {
            // Handle the NegativeDeposit exception and print the error message
            System.out.println(n.getMessage());
        }

        // Test case 2: Attempt to withdraw more than the available balance
        try {
            // Create an account for "Soham" with initial balance 0
            Account b = new Account("Soham");
            // Attempt to withdraw 100, which should throw InsufficientBalanceException
            b.withdraw(100);
        } catch (InsufficientBalanceException i) {
            // Handle the InsufficientBalanceException and print the error message
            System.out.println(i.getMessage());
        }
    }
}
