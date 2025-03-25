import java.util.ArrayList;

public class LibrarySummary {
    public static void printInventory(ArrayList<Book> books){
        for(Book book: books){
            System.out.println(book.toString());
        }
    }
}
