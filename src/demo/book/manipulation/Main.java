package demo.book.manipulation;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int choice = 0;
	Library library=new Library();
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("1.Add Book\n" +
            "2.Display all book details\n" +
            "3.Search Book by author \n" +
            "4.Count number of books - by book name\n" +
            "5.Exit\n" +
            "Enter your choice:");
	switch(choice) {	
case 1:{
	System.out.println("Enter isbn no");
	int isbn=sc.nextInt();
	System.out.println("Enter the book name");
	String bookName=sc.nextLine();
	System.out.println("Enter the author name");
	String authorName=sc.nextLine();	
	Book book=new Book();
	book.setIsbnno(isbn);
	book.setBookName(bookName);
	book.setAuthor(authorName);
	library.addBook(book);
	break;
}
case 2:{
	System.out.println("Display all book details");
	break;
}
	}

	}
}
}
