package wipro_pjp.oops_inheritance.encapAndabstract;

public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		return "Book Name: " + name + ", Author: " + author + ", Price: " + price + ", QtyInStock: " + qtyInStock;
	}
	
	
	
	
	
//	private String bname;
//	private Author author;
//	private double price;
//	private int qty;
//	public Book() {
//		
//	}
//	public Book(String bname, double price, int qty) {
//		super();
//		this.bname = bname;
//		
//		this.price = price;
//		this.qty = qty;
//	}
//	public String getBname() {
//		return bname;
//	}
//	public void setBname(String bname) {
//		this.bname = bname;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public static void main(String[] args) {
//		Book b=new  Book("java", 1000, 5);
//		b.setBname("sa");
//	
//		Author author=new Author("sumn","sum@g", 'M');
//	}
//	

}
