class Book {
    int isbn;
    String title;
    String author;
    
    Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book{" +
                "'isbn=" + isbn + '\'' +
                ", 'title=" + title + '\'' +
                ", 'author=" + author + '\'' +
                '}';
    }
}

class Library {
    String name;
    Book[] books;    // Aggregation
    int bookCount;

    Library(String name, int capacity) {
        this.name = name;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    void addBook(Book book) {
        if(bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        if (bookCount == 0) {
            System.out.println("No books available.");
        }
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    void udpateBook(int isbn, String newTitle, String newAuthor) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn == isbn) {
                books[i].title = newTitle;
                books[i].author = newAuthor;
                System.out.println("Book updated: " + books[i]);
                return;
            }
        }
        System.out.println("Book with isbn number '" + isbn + "' not found.");
    }

    void deleteBook(int isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn == isbn) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j+1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Book with isbn number '" + isbn + "' has been removed");
                return;
            }
        }
        System.out.println("Book with isbn number '" + isbn + "' not found.");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Book b1 = new Book(1, "The Alchemist", "Paulo Coelho");
        Book b2 = new Book(2, "1984", "George Orwell");
        Book b3 = new Book(3, "To Kill a MockingBird", "Harper Lee");

        Library library = new Library("City Central", 5);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen"));
        library.addBook(new Book(5, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(6, "Moby-Dick", "Herman Melville"));

        library.displayBooks();

        library.udpateBook(2, "Nineteen Eighty-Four", "George Orwell");
        library.displayBooks();

        library.deleteBook(2);
        library.displayBooks();
    }
}
