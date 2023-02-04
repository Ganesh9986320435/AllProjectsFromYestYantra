package mcdonaldsprojectjsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int itemid;
private String itemname;
private String itemdesc;
private double itemprice;
private String itemoffer;
private int itemquantity;
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public String getItemdesc() {
	return itemdesc;
}
public void setItemdesc(String itemdesc) {
	this.itemdesc = itemdesc;
}
public double getItemprice() {
	return itemprice;
}
public void setItemprice(double itemprice) {
	this.itemprice = itemprice;
}
public String getItemoffer() {
	return itemoffer;
}
public void setItemoffer(String itemoffer) {
	this.itemoffer = itemoffer;
}
public int getItemquantity() {
	return itemquantity;
}
public void setItemquantity(int itemquantity) {
	this.itemquantity = itemquantity;
}

}
