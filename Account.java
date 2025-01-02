public class Account {
    private int balance;

    // Constructor
    public Account(int initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Error: Initial balance was invalid. Balance set to 0.");
        }
    }

    // Member function to add an amount to the current balance
    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Member function to withdraw money from the account
    public void debit(int amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    // Member function to return the current balance
    public int getBalance() {
        return balance;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Create two Account objects
        Account account1 = new Account(500);
        Account account2 = new Account(-100); // should set balance to 0 and display an error

        // Test the member functions
        account1.credit(200); // add 200 to account1
        System.out.println("Account 1 balance after credit: $" + account1.getBalance());

        account1.debit(100); // withdraw 100 from account1
        System.out.println("Account 1 balance after debit: $" + account1.getBalance());

        account1.debit(700); // try to withdraw 700 from account1, should display error
        System.out.println("Account 1 balance after attempting an overdraft: $" + account1.getBalance());

        account2.credit(150); // add 150 to account2
        System.out.println("Account 2 balance after credit: $" + account2.getBalance());

        account2.debit(50); // withdraw 50 from account2
        System.out.println("Account 2 balance after debit: $" + account2.getBalance());
    }
}