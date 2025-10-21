package day4hrs;

// Class representing a bank account with deposit and withdrawal functionality
public class Account {

    // Unique account number, auto-incremented using a static counter
    int accNumber;
    // Name of the account holder
    String name;
    // Current balance in the account, initialized to 0
    int balance = 0;
    // Static counter to generate unique account numbers
    static int counter = 0;
    
    // Unused fields (potentially for future use or debugging)
    int depositAmt;
    int WithdrawalAmt;

    // Constructor to initialize an account with a name and auto-generated account number
    public Account(String name) {
        this.accNumber = counter++; // Auto-increment account number
        this.name = name;
        this.balance = 0; // Initialize balance to 0
    }

    // Deposits the specified amount into the account if it is positive
    public void deposit(double amount) throws NegativeDeposit {
        if (amount > 0) {
            balance += amount; // Add amount to balance
        } else {
            // Throw NegativeDeposit exception for invalid (non-positive) deposit amounts
            throw new NegativeDeposit("You have entered negative amount.");
        }
    }

    // Withdraws the specified amount from the account if sufficient balance exists
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount >= 0) {
            balance -= amount; // Deduct amount from balance
        } else {
            // Throw InsufficientBalanceException if balance is insufficient
            throw new InsufficientBalanceException("Cannot be Withdrawn. Enter valid amount.");
        }
    }
}
