package day4hrs;

// Custom exception class for handling insufficient balance during withdrawal
public class InsufficientBalanceException extends Exception {

    // Constructor to initialize the exception with a custom message
    public InsufficientBalanceException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}
