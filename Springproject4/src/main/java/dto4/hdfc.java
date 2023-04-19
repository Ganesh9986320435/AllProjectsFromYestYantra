package dto4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class hdfc implements BankAccount{

	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("10000");
	}
	
}
