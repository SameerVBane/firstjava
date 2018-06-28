package sam.polymorhism;

abstract class AbstractConstructor {
	
	AbstractConstructor()
	{
		System.out.println("Abstract class constructor");
	}
	void m1()
	{
		System.out.println("m1 method");
	}

}

class test extends AbstractConstructor
{
	void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{
		test t = new test();
		t.m1();
		t.m2();
	
		
	}
	
}