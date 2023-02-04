package preparedStatement_2;

import java.sql.SQLException;

public class Person_main {
	public static void main(String[] args) throws Exception {
		PersonCRUD personcrud=new PersonCRUD();
//		personcrud.savePerson(11,"mani",9986320435l);
//		personcrud.updatePerson(100,"honey");
//		personcrud.deletePerson(11);
		personcrud.selectPerson(1);
		System.out.println("over");
	}
}
