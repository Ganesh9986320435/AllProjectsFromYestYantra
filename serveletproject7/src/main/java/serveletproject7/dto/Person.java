package serveletproject7.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	private String fnmae;
	private String sname;
	@Id
	private String email;
	private String pass;
	private long phone;
	public String getFnmae() {
		return fnmae;
	}
	public void setFnmae(String fnmae) {
		this.fnmae = fnmae;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [fnmae=" + fnmae + ", sname=" + sname + ", email=" + email + ", pass=" + pass + ", phone="
				+ phone + "]";
	}
	
}
