package day4hrs;

// Custom exception class for handling negative deposit attempts
public class NegativeDeposit extends Exception {

    // Constructor to initialize the exception with a custom message
    public NegativeDeposit(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}
