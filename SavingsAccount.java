public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    // Constructor
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate the monthly interest and add it to the balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // Method to get the savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Main method to test the SavingsAccount class
    public static void main(String[] args) {
        // Set the annual interest rate
        SavingsAccount.modifyInterestRate(0.04);

        // Create two savings account objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Calculate and print the new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());

        // Modify the interest rate and calculate the next month's interest
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1 balance after interest rate change: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance after interest rate change: $" + saver2.getSavingsBalance());
    }
}