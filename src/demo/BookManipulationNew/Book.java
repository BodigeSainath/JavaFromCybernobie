package demo.BookManipulationNew;

public class Book {
    private int isbnno;
    private String bookName,author;

    public int getIsbnno() {
        return isbnno;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(){

    }
    public Book(int isbnno, String bookName, String author) {
        this.isbnno = isbnno;
        this.bookName = bookName;
        this.author = author;
    }
}
