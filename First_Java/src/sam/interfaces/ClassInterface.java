package sam.interfaces;

public class ClassInterface {
	
	interface it1
	{
		int a= 10; //by default this variable is public static final
		void m1();
		
	}

}

class Test789 implements ClassInterface.it1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
		System.out.println("interface variable" +a);
	}
	
	public static void main(String[] args)
	{
		new Test789().m1();
	}
	
}