package march6th;

public class TR1 {
	public static void main(String[] args) {
		Box<?> box=new Box();
		box.setA("hi");
		System.out.println(box.getA());
		hi<Integer> hi=new hi();
		hi.setA(1);
		System.out.println(hi.getA());
	}
}
class Box<T>
{
	T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
}
class hi<Integer>{
	Integer a;

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	
}
