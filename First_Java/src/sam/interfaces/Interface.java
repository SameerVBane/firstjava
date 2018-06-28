package sam.interfaces;

public interface Interface //by default abstract
{

	/*Interface is a extension of abstract class.
	 * Interface contains abstract methods only.
	 * Interface just contains the functionality of the application / definition of methods and not the implementation of methods
	 * Object creation is not allowed for Interface
	 * 100% pure abstract class
	 * After compilation .class file will be generated for interfaces just like other classes
	 */

	
	void m1();//by default public abstract 
	void m2();
	void m3();
	
}

class intclass implements Interface
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");	
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}
	
	public static void main(String[] args)
	{
		intclass t = new intclass();
		t.m1();
		t.m2();
		t.m3();
		
		Interface i = new intclass();
		i.m1();
		i.m2();
		i.m3();
		
		
	}
}
