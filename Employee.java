public class Employee {
    private String firstName;
    private String lastName;
    private int monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, int monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Get yearly salary
    public int getYearlySalary() {
        return monthlySalary * 12;
    }

    // Give a 10% raise
    public void giveRaise() {
        monthlySalary = monthlySalary + (monthlySalary / 10);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        // Display yearly salaries
        System.out.println(emp1.firstName + " " + emp1.lastName + "'s yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.firstName + " " + emp2.lastName + "'s yearly salary: $" + emp2.getYearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Display yearly salaries after raise
        System.out.println(emp1.firstName + " " + emp1.lastName + "'s yearly salary after raise: $" + emp1.getYearlySalary());
        System.out.println(emp2.firstName + " " + emp2.lastName + "'s yearly salary after raise: $" + emp2.getYearlySalary());
    }
}