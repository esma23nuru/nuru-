public class Book {
    private String bookName;
    private String isbn;
    private String authorName;
    private String publisher;

    // Constructor
    public Book(String bookName, String isbn, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // Setter for bookName
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Getter for bookName
    public String getBookName() {
        return this.bookName;
    }

    // Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for isbn
    public String getIsbn() {
        return this.isbn;
    }

    // Setter for authorName
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Getter for authorName
    public String getAuthorName() {
        return this.authorName;
    }

    // Setter for publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter for publisher
    public String getPublisher() {
        return this.publisher;
    }

    // Method to get book information
    public String getBookInfo() {
        return "Book Name: " + this.bookName + ", ISBN: " + this.isbn + ", Author: " + this.authorName + ", Publisher: " + this.publisher;
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create an array of 30 Book objects
        Book[] books = new Book[30];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Book" + (i + 1), "ISBN" + (i + 1), "Author" + (i + 1), "Publisher" + (i + 1));
        }

        // Print book information for each Book object
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
    }
}