package mcdonaldsprojectjsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrder {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String foodname;
private String email;
private String address;
private long phone;
private List<Items> list;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public List<Items> getList() {
	return list;
}
public void setList(List<Items> list) {
	this.list = list;
}

}
