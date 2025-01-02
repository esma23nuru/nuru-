public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Member function to calculate the perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Member function to calculate the area
    public double getArea() {
        return length * width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}