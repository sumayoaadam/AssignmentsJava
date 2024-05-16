class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 50.00;

    public SavingsAccount(int accountNumber, double balance, String fullName) {
        super(accountNumber, balance, fullName);
    }

    // Overriding the withdraw method with transaction fee and minimum balance check
    @Override
    public void withdraw(double amount) {
        final double TRANSACTION_FEE = 2.00;
        if (amount + TRANSACTION_FEE > getBalance()) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal and transaction fee.");
        }
        if (getBalance() - (amount + TRANSACTION_FEE) < MIN_BALANCE) {
            throw new IllegalArgumentException("Withdrawal would result in balance below the minimum balance.");
        }
        super.withdraw(amount + TRANSACTION_FEE);
    }

    // Method to apply monthly interest rate
    public void applyInterest(double annualInterestRate) {
        double monthlyInterest = getBalance() * (annualInterestRate / 12) / 100;
        deposit(monthlyInterest);
    }
}
