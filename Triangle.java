public class Triangle {
    private int a;
    private int b;
    private int c;

    // Constructor
    public Triangle(int newa, int newb, int newc) {
        this.a = newa;
        this.b = newb;
        this.c = newc;
    }

    // Method to check if it is a valid triangle
    public boolean isTriangle() {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Method to get the area of the triangle
    public double getArea() {
        if (isTriangle()) {
            double s = (a + b + c) / 2.0; // Semi-perimeter
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0;
    }

    // Main method to test the Triangle class
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        if (triangle.isTriangle()) {
            System.out.println("The area of the triangle is: " + triangle.getArea());
        } else {
            System.out.println("The given sides do not form a triangle.");
        }
    }
}