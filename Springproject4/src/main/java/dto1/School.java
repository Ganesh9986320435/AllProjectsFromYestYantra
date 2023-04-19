package dto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
Student student;
void teach()
{
	student.study();
}
}
