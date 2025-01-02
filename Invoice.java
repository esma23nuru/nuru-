public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0;
    }

    // Member function to calculate the invoice amount
    public int getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Main method to test the Invoice class
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 10, 15);
        System.out.println("Part Number: " + invoice.partNumber);
        System.out.println("Part Description: " + invoice.partDescription);
        System.out.println("Quantity: " + invoice.quantity);
        System.out.println("Price per Item: " + invoice.pricePerItem);
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}