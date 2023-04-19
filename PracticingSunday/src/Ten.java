
public class Ten implements Cloneable{
	int id;
	final int h;
	Ten(int h)
	{
		this.h=h;
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Ten ten=new Ten(6);
		Ten ten2=(Ten) ten.clone();
		System.out.println(ten==ten2);
	}
}
