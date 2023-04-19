package dto4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sbi implements BankAccount{

	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("100000000");
	}

}
