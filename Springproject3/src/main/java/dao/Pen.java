package dao;
import org.springframework.stereotype.Component;

@Component
public class Pen implements Item{
	private int cost=60;
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("wtrite");
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
