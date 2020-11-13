public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book testBook = new Book("Test Book", 123);
        library.add(new Book("Test Book2", 128));
        library.add(testBook);
        // As this is not a Set, but a list we can add the same book twice or more
        library.add(testBook);
        System.out.println("Full library:");
        System.out.println(library.listCatalog());

        // The removal will remove the first occurrence of the object
        library.delete(testBook);
        System.out.println("Library after removal:");
        System.out.println(library.listCatalog());
    }

}
