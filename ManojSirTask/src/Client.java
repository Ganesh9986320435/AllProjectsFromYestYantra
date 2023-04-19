import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Object object1=FactoryProvider.getFactory().creat();
		if(object1 instanceof Dog)
		{
			System.out.println(new Dog().getType());
			System.out.println(new Dog().makeSound());
		}
		else if(object1 instanceof Bear)
		{
			System.out.println(new Bear().getType());
			System.out.println(new Bear().makeSound());
		}
		else if(object1 instanceof Duck)
		{
			System.out.println(new Duck().getType());
			System.out.println(new Duck().makeSound());
		}
		else if(object1 instanceof Black)
		{
			System.out.println(new Black().getColor());
		}
		else if(object1 instanceof White)
		{
			System.out.println(new White().getColor());
			
		}
		else if(object1 instanceof Brown)
		{
			System.out.println(new Brown().getColor());
		}
		else {
			System.out.println("select any one");
		}
	}
}
class FactoryProvider{
	
	static AbstractFactory getFactory()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value /n 1.for animal /n 2.for color");
		int i=scanner.nextInt();
		if(i==1)
		{
			return new AnimalFactory();
		}
		return new ColorFactory();
	}
}
interface Animal {
	String getType();

	String makeSound();
}

class Duck implements Animal {

	@Override
	public String getType() {
		return "duck";
	}

	@Override
	public String makeSound() {
		return "buck";
	}

}

class Dog implements Animal {

	@Override
	public String getType() {
		return "dog";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "bow";
	}

}

class Bear implements Animal {

	@Override
	public String getType() {
		return "bear";
	}

	@Override
	public String makeSound() {
		return "oooo";
	}
}
interface Color{
	String getColor();
}
class White implements Color{

	@Override
	public String getColor() {
		return "ur color is white";
	}
	
}
class Brown implements Color{

	@Override
	public String getColor() {
		return "ur color is brown";
	}
	
}class Black implements Color{

	@Override
	public String getColor() {
		return "ur color is Black";
	}
	
}
interface AbstractFactory<T>{
	 T creat();
}
class AnimalFactory implements AbstractFactory{

	@Override
	public Object creat() {
		Scanner scanner=new Scanner(System.in);
			System.out.println("enter the animal /n 1.for Duck /n 2.for dog 3.for Bear");
			int a=scanner.nextInt();
			if(a==1)
				return new Duck();
			else if (a==2) 
				return new Dog();
			else
				return new Bear();
	}
	
}
class ColorFactory implements AbstractFactory{

	@Override
	public Object creat() {
		Scanner scanner=new Scanner(System.in);
			System.out.println("enter the color /n 1.white 2.brown 3.black");
			int b=scanner.nextInt();
			if(b==1)
				return new White();
			else if (b==2) 
				return new Brown();
			else
				return new Black();
	}
	
}






























