package manytomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	private int c_id;
	private String name;
	@ManyToMany(mappedBy = "list")
	private List<Student> list;
	public int getId() {
		return c_id;
	}
	public void setId(int id) {
		this.c_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Course [id=" + c_id + ", name=" + name + ", list=" + list + "]";
	}
	
}
