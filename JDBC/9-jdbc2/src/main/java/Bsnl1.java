import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bsnl1 {
	@Id
	private int id;
	@Override
	public String toString() {
		return "Bsnl [id=" + id + ", name=" + name + ", fnameString=" + fnameString + ", mname=" + mname + ", adress="
				+ adress + ", marks=" + marks + ", percentage=" + percentage + "]";
	}
	private String name;
	private String fnameString;
	private String mname;
	private String adress;
	private int marks;
	private int percentage;
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
	public String getFnameString() {
		return fnameString;
	}
	public void setFnameString(String fnameString) {
		this.fnameString = fnameString;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
