package advance;

public class Items {
	int salary ;
	String mobile;
	String car;
	Items(int salary,String mobile,String car)
	{
		this.salary=salary;
		this.mobile=mobile;
		this.car=car;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	Items()
	{
		
	}
}
