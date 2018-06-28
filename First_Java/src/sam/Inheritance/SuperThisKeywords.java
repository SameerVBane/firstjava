package sam.Inheritance;

class parent
{
	int a=10;
	int b= 20;
	void m1()
	{
		System.out.println("Parent class m1 method");
	}
}

class child extends parent
{
	int a=100;
	int b=200;
	
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
	
	void m1()
	{
		System.out.println("Child class m1 method");
	}
	
	void m2()
	{
		m1();
		super.m1();
	}
}
public class SuperThisKeywords {

	public static void main(String[] args)
	{
		new child().add(1000,2000);
		new child().m2();
	}
	
}
