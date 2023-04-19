
public class Book implements Comparable{
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
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Book book=(Book)arg0;
		return this.name.compareTo(book.name);
	}
	
}
