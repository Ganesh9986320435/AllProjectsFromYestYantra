package jdbc_database_1;

import java.util.ArrayList;

public class PersonDriver {
	public static void main(String[] args) throws Exception {
		Person p=new Person();
		p.setId(1010);
		p.setName("lololo");
		p.setPhone(998632043l);
		Person p1=new Person();
		p1.setId(1020);
		p1.setName("lololo");
		p1.setPhone(998632043l);
		ArrayList<Person> aList=new ArrayList<Person>();
		aList.add(p);
		aList.add(p1);
		PersonCRUD personCRUD=new PersonCRUD();
		personCRUD.signinPoint(aList);
		}
}
