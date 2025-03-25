public class Book {
    private String title;
    private int bookID;
    BookStatus status;
    private static int id=0;
    public Book(String title){
        this.title=title;
        bookID=id;
        status=BookStatus.AVAILABLE;
        id++;
    }
    public void borrow(){
        status=BookStatus.BORROWED;
    }
    public void returnBook(){
        status=BookStatus.RETURNED;
    }

    public String toString() {
        return "Book ID: "+ bookID +", Title: "+ title + ", Status: "+ status;
    }
}
