import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
       System.out.printf("Searching by isbn: %s\n", isbn);
       Book book = bookRepo.findByIsbn(isbn);
       if (book != null) {
           System.out.printf("1 book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
       }else {
           System.out.println("Book not found");
       }
       System.out.println("\n\n");
    }
    public void searchByTitle(String keyword) {
        System.out.printf("Searching by keyword: %s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found\n", books.size());
        for (Book book : books) {
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println("");
    }
    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            book.checkOut();
            System.out.println("Book checked out");
        }
        else{
            System.out.printf("Book not found");
            System.out.printf("Reason: No such %s on record\n", isbn);
        }
    }
    public void checkInBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            book.checkIn();
            System.out.println("Book checked in");
        }
        else{
            System.out.printf("Book not found");
            System.out.printf("Reason: No such %s on record\n", isbn);
        }
    }
}
