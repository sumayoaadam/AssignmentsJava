public class Bank {
    public static void main(String[] args) {
        // Demo: Create accounts and perform operations
        Account account = new Account(1, 1000, "Mohamed Ali");
        SavingsAccount savingsAccount = new SavingsAccount(2, 500, "Hawa Osman");

        account.deposit(500);
        savingsAccount.deposit(200);

        account.withdraw(300);
        savingsAccount.withdraw(50);

        savingsAccount.applyInterest(5); // 5% annual interest rate

        System.out.println("Regular Account Balance: " + account.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Array for polymorphism demonstration
        Account[] accounts = new Account[]{account, savingsAccount};
        for (Account acc : accounts) {
            System.out.println(acc.getFullName() + "'s account balance: " + acc.getBalance());
        }
    }
}
