package demo.BookManipulationNew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add Book\n" +
                "2.Display all book details\n" +
                "3.Search Book by author \n" +
                "4.Count number of books - by book name\n" +
                "5.Exit");
        Book b=new Book();
        Library l=new Library();
        int choice=sc.nextInt();
        switch (choice){
            case 1: System.out.println("Enter book number");
                    b.setIsbnno(1);
                    System.out.println("Enter Book nmae");
                    b.setBookName("c++");
                    System.out.println("enter author");
                    b.setAuthor("s");
                    l.bookList.add(b);
                    break;
            case 2:
                    for(Book bbb : l.bookList){
                        System.out.println(bbb);
                    }
        }

    }
}
