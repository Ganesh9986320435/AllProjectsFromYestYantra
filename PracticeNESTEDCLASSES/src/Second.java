
public interface Second {
	void m1();
	
		Second second=new Second() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
			
		};
		Second second2=new Second() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};
	
}
