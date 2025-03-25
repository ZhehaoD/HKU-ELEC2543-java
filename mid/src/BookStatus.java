public enum BookStatus {
    AVAILABLE("AVAILABLE"),
    BORROWED("BORROWED"),
    RETURNED("RETURNED");
    private final String BookStatus;

    private BookStatus(String bookStatus) {
        this.BookStatus = bookStatus;
    }

    public String toString() {
        return this.BookStatus;
    }
}
