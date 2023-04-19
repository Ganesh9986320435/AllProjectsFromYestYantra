package springMVC_Student.main;

import org.springframework.beans.factory.annotation.Autowired;

import springMVC_Student.dao.Dao;
import springMVC_Student.dto.Student;

public class Main {
	
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("gani");
		student.setSub("science");
		Dao dao1=new Dao();
		dao1.save(student);
	}
}
