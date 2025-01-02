public class Complex {
    private double realPart;
    private double imaginaryPart;

    // Constructor with default values
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with specified values
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to add two Complex numbers
    public Complex add(Complex other) {
        return new Complex(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart);
    }

    // Method to subtract two Complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.realPart - other.realPart, this.imaginaryPart - other.imaginaryPart);
    }

    // Method to print the Complex number
    @Override
    public String toString() {
        return "(" + this.realPart + ", " + this.imaginaryPart + "i)";
    }

    // Main method to test the Complex class
    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.5, 4.5);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);

        System.out.println("Complex number 1: " + num1);
        System.out.println("Complex number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}