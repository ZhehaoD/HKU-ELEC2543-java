import java.util.ArrayList;
public class LibraryManagement {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Data Structures"));
        books.add(new Book("Algorithms"));
        books.add(new Book("Database System"));
        books.add(new Book("Operating System"));
        LibrarySummary.printInventory(books);
        System.out.println();
        books.get(0).borrow();
        books.get(1).borrow();
        books.get(2).returnBook();
        LibrarySummary.printInventory(books);
    }
}
