package wipro_pjp.oops_inheritance.encapAndabstract;

public class main {

	public static void main(String[] args) {
		Author author = new Author("Shubham", "skc903@gmail.com", 'M');
		Book book = new Book("Master in Java", author, 199.0, 500);
		
		System.out.println(book);
	}

}