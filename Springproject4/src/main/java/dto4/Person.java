package dto4;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Person {
	@Autowired
	@Qualifier("hdfc")
BankAccount bankAccount;
	@PostConstruct
	void hello()
	{
		System.out.println("dsjijdij");
	}
void display()
{
	bankAccount.balance();
}
}
