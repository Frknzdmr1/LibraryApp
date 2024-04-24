import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("83471", "The Dead of Night", "Horror", null, "S.K. Eleton", 10, 7));
        books.add(new Book("25274", "Castle and Crenellations", "Historical", null, "H.P. Anderson",5,20));
        books.add(new Book("51573", "The Knight's Sword", "Fantasy", null, "F.E. Anvil",45,35));
        books.add(new Book("78542", "Alchemist", "Romance", null, "Paolo Cohello",25,14));
        books.add(new Book("26135", "The Knight's", "Fantasy", null, "F.E. Anvil",1,23));
        books.add(new Book("79564", "Castle Siege", "Thriller", null, "P.B. Jelliton",6,24));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}












