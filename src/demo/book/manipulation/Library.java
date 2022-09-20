package demo.book.manipulation;

import java.util.ArrayList;

public class Library extends Book{
ArrayList<Book> bookList=new ArrayList<>();
void addBook(Book book) {
	bookList.add(book);
}
}
