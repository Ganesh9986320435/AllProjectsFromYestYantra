
public class Book {
	String name;
	int id;
	public Book(String name,
	int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
	}
	
}
