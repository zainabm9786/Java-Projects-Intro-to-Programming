public class Book extends Item {
    private long isbn_number;
    private String author;

    Book() {

    }

    @Override
    public String getListing() {
        return "Book name - "+getTitle() +"\nAuthor - "+getAuthor() +"\nISBN # - "+isbn_number;
    }

    Book(long in, String a, String t) {
        this.isbn_number = in;
        this.author = a;
        super.setTitle(t);
    }



    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn_number(long isbn_number) {
        this.isbn_number = isbn_number;
    }

    public long getIsbn_number() {
        return isbn_number;
    }
}
