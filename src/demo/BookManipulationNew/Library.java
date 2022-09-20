package demo.BookManipulationNew;

import java.util.ArrayList;

public class Library {
 ArrayList<Book> bookList=new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    Book book=new Book();
    public  void addBook(Book book){
        Book book1=new Book(1,"java","sainatg");
        book.setIsbnno(2);
        book.setBookName("c");
        book.setAuthor("sn");
    bookList.add(book1);
    bookList.add(book);
    }


}
