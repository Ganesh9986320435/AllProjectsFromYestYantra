package springproject2;

public class School {
	String name;
	double fees;
	String address;
	Student student;
		
		@Override
	public String toString() {
		return "School [name=" + name + ", fees=" + fees + ", address=" + address + ", student=" + student + "]";
	}

		public School(String name, double fees, String address, Student student) {
			super();
			this.name = name;
			this.fees = fees;
			this.address = address;
			this.student = student;
		}
	
}
