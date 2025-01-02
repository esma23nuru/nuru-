public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        this.day = day;
        this.year = year;
    }

    // Member function to display the date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    // Main method to test the Date class
    public static void main(String[] args) {
        // Create a Date object
        Date date1 = new Date(10, 14, 2024);
        Date date2 = new Date(15, 1, 2023); // should set month to 1

        // Display the dates
        date1.displayDate();
        date2.displayDate();
    }
}