package demo.Advance.java.BookManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book=new Book();
        Library library=new Library();
        while (true){
            System.out.println("1.Add Book\n" +
                    "2.Display all book details\n" +
                    "3.Search Book by author \n" +
                    "4.Count number of books - by book name\n" +
                    "5.Exit");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter the isbn no");
                    int isbn = sc.nextInt();
                    System.out.println("Enter the book name:");
                    String bname = sc.next();
                    System.out.println("Enter the author name:");
                    String bauth = sc.next();
                    book.setIsbnno(isbn);
                    book.setBookName(bname);
                    book.setAuthor(bauth);
                    library.addBook(book);
                    break;
                }

                case 2: {
                    for (Book b : library.getBookList()) {
                        System.out.println(b.getIsbnno());
                        System.out.println(b.getBookName());
                        System.out.println(b.getAuthor());
                    }
                    break;
                }

                case 3: {
                    System.out.println("Enter author name");
                    String authName = sc.next();
                    List<Book> books = library.viewBooksByAuthor(authName);
                    if (books.isEmpty()) {
                        System.out.println("Nothing is written by this  author");
                    } else {
                        for (Book book1 : books) {
                            System.out.println("The book num is " + book1.getIsbnno());
                            System.out.println("Book name is " + book1.getBookName());
                            System.out.println("author name " + book1.getAuthor());
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter book name to search how many available");
                    String search = sc.next();
                    int count = library.countnoofbook(search);
//                    if (count != 0) {
                        System.out.println(" totol available copies " + count);
//                    } else
//                        System.out.println("No books available");

                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        }
    }
}