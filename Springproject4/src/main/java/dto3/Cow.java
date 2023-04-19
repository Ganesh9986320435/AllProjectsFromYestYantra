package dto3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("grass");
	}

}
