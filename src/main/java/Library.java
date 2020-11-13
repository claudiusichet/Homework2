import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog = new ArrayList<Book>();

    public void add(Book book) {
        catalog.add(book);
    }

    public void delete(Book book) {
        catalog.remove(book);
    }

    public String listCatalog() {
        StringBuilder books = new StringBuilder();

        for (Book book : catalog) {
            books.append("[Name : ");
            books.append(book.getName());
            books.append(", Number of pages: ");
            books.append(book.getPageNumber());
            books.append("] \n");
        }
        return books.toString();

    }


}
