import java.util.Date;
import java.util.ArrayList;
import java.util.List;

// Transaction class to record each transaction detail.
class Transaction {
    private Date date;
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    // Getters
    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

class Account implements Comparable<Account> {
    private int accountNumber;
    private double balance;
    private Date dateCreated;
    private String fullName;
    private List<Transaction> transactions;

    // Account constructor
    public Account(int accountNumber, double balance, String fullName) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(balance, 0); // Balance cannot be negative.
        this.fullName = fullName;
        this.dateCreated = new Date(); // Current date
        this.transactions = new ArrayList<>();
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            throw new IllegalArgumentException("Insufficient funds.");
        }
    }

    // Getters and Setters (encapsulation)
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Comparable implementation to sort accounts by balance
    @Override
    public int compareTo(Account other) {
        return Double.compare(this.balance, other.balance);
    }
}


// This class is used for demonstration purposes. In a real-world scenario, this would likely be part of a larger system.
