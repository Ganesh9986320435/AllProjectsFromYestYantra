package advance;

public class Example1 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.m1(new Company("Ty", "Banglore", 583132));
		Company c1=e1.m2();
		System.out.println(c1.name+" "+c1.address+" "+c1.pincode);
	}
}
class Company
{
	String name;
	String address;
	int pincode;
	public Company(String name, String address, int pincode) {
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
class Employee
{
	public void m1(Company c1)
	{
		System.out.println(c1.getName()+" "+c1.address+" "+c1.pincode);
	}
	public Company m2()
	{
		Company c1=new Company("Ty", "Banglore", 583132);
		return c1;
	}
}