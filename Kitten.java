public class Kitten {
    private String name;
    private String owner;
    private int age;

    // Constructor
    public Kitten(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.age = 0; // Initial age is 0
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Method to increase age by one year
    public void haveBirthday() {
        age++;
    }

    // Override toString method to return the desired string format
    @Override
    public String toString() {
        return name + " is " + age + " and belongs to " + owner;
    }

    // Main method to test the Kitten class
    public static void main(String[] args) {
        Kitten kitten = new Kitten("Whiskers", "Alice");
        System.out.println(kitten.toString());

        // Simulate having a birthday
        kitten.haveBirthday();
        System.out.println(kitten.toString());
    }
}