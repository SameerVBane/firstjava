package sam.day1;

public class MethodsCall {
	
	void m1()
	{
		m2();
		System.out.println("m1 method");
		m2();
		m3();
	}
	
	void m2()
	{
		System.out.println("m2 method");
	}
	
	void m3()
	{
		m2();
		System.out.println("m3 method");
	}
	
	public static void main(String[] args)
	{
		MethodsCall t = new MethodsCall();
		
		t.m1();
		
	}

}
