package library;

class Book {
    private String title;
    private String author;

   
    private static int bookCount = 0;

   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;  
    }

   
    public static int getBookCount() {
        return bookCount;
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        System.out.println("Number of Book objects created: " + Book.getBookCount());
    }
}