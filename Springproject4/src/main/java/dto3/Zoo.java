package dto3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired

	Animal animal;
	void food()
	{
		animal.eat();
	}
}