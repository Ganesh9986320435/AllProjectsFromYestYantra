import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jio {
	@Override
	public String toString() {
		return "Jio [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", adress=" + adress
				+ ", fbpass=" + fbpass + ", instapass=" + instapass + ", whatspass=" + whatspass + ", snappass="
				+ snappass + ", twitterpass=" + twitterpass + "]";
	}
	@Id
	int id;
	String name;
	String email;
	String password;
	String adress;
	String fbpass;
	String instapass;
	String whatspass;
	String snappass;
	String twitterpass;
	public Jio() {
		// TODO Auto-generated constructor stub
	}
	public Jio(int id, String name, String email, String password, String adress, String fbpass, String instapass,
			String whatspass, String snappass, String twitterpass) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.adress = adress;
		this.fbpass = fbpass;
		this.instapass = instapass;
		this.whatspass = whatspass;
		this.snappass = snappass;
		this.twitterpass = twitterpass;
	}
	
}
