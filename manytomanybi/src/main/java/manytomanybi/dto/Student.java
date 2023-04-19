package manytomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name = "c_id"))
	private List<Course> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getList() {
		return list;
	}
	public void setList(List<Course> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
}
