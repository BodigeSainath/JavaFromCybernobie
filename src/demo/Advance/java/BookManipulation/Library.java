package demo.Advance.java.BookManipulation;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList=new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public  boolean isEmpty(){
        if(bookList.isEmpty()){
            return  false;
        }
        return  true;
    }
   public ArrayList<Book> viewAllBooks(){
         return bookList;
    }
    ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> viewBookByAuthor=new ArrayList<>();
            for(Book b : bookList){
                if(b.getAuthor().contains(author)){
                    viewBookByAuthor.add(b);
                }
            }
        return viewBookByAuthor;
    }
    public int countnoofbook(String bname){
        int c=0;
        for(Book book: bookList){
            if(book.getBookName().contains(bname)){
                c+=1;
            }
        }
    return c;
     //   return (int) bookList.stream().filter(book -> book.getBookName().contains(bname)).count();
    }
}
