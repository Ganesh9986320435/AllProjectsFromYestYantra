package advance;

public class Person {
	public static void main(String[] args) {
//		Person1 p1=new Person1();
//		p1.salary(5000);
		Person2 p2=new  Person2();
//		p2.items(5000, "iq", "no car");
//		Items i1=new Items(5000, "iq", "no car");
//		p2.newItems(i1);
		Items i1=p2.getItems();
		System.out.println(i1.getCar()+" "+i1.getMobile()+" "+i1.getSalary());
	}
}
class Person1
{
	public void salary(int sal)
	{
		System.out.println("salary is   "+sal);
	}
}
class Person2
{
	public void items(int sal,String mobile,String car)
	{
		System.out.println("the person has"+sal+mobile+car);
	}
	public void newItems(Items i)
	{
		System.out.println("items are  "+i.salary+"   "+i.mobile+"   "+i.car);
	}
	public Items getItems()
	{
		Items i1=new Items();
		i1.setSalary(5000);
		i1.setCar("noooo");
		i1.setMobile("iq");
		return i1;
	}
}
