package March9;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		
		Box b2 = new Box();
		Box b1 = new Box();
		List<Box> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		m1(list);
	}
	
	public static <T>T m1(List<Box> list){
		return (T) list;
	}
}	
class Box{
	
}

