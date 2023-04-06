package Inheritance;

public class Aggregation_EX2 {
	public static void main(String[] args) {
		Author author = new Author("Ram", 62, "India");
        Publisher publisher = new Publisher("ABC Publisher", "A-1110", "India");
        Book book = new Book("Core Java", 800, author, publisher);
        System.out.println("Book name: " + book.name);
        System.out.println("Book price: " + book.price);

        System.out.println("---------------------Author Details------------------------");
        System.out.println("Author Name: " + book.author.name);
        System.out.println("Author Age: " + book.author.age);
        System.out.println("Author Place: " + book.author.place);

        System.out.println("---------------------Publisher Details------------------------");
        System.out.println("Publisher Name: " + book.publisher.name);
        System.out.println("Publisher ID: " + book.publisher.id);
        System.out.println("Publisher City: " + book.publisher.city);
	}
}
