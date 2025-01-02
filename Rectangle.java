public class Rectangle {
    private double length;
    private double width;

    // Constructor with default values
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with specified values
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Set function for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Must be > 0.0 and < 20.0");
        }
    }

    // Set function for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Must be > 0.0 and < 20.0");
        }
    }

    // Get function for length
    public double getLength() {
        return length;
    }

    // Get function for width
    public double getWidth() {
        return width;
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
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());

        // Testing invalid length and width
        rect.setLength(25);
        rect.setWidth(-5);
    }
}