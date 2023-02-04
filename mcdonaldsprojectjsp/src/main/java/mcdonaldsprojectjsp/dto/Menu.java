package mcdonaldsprojectjsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String iname;
private String desc;
private double price;
private String offer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getOffer() {
	return offer;
}
public void setOffer(String offer) {
	this.offer = offer;
}

}
