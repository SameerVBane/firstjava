package sam.day1;

public class StaticClass {
	
	/*Static blocks
	 * Used to write logics
	 * Initilise static variables
	 * .class file loading
	 * 
	 * Syntax
	 * 
	 * Static
	 * {
	 *Write logic here
	 * }
	 * 
	 * 
	 * Java test.class
	 * JVM performs 2 actions at runtime when class file executed
	 * 1. JVM loads .class byte code into memory
	 * 2. It calls main method to starts execution
	 * 
	 * Static blocks executed only once
	 * 
	 * Instance blocks executed when object is instantiated
	 */
	
	{
		System.out.println("Instance block 1");
	}
	{
		System.out.println("Instance block 2");
	}
	static
	{
		System.out.println("Static block 1");
	}
	static
	{
		System.out.println("Static block 2");
	}
	
	StaticClass()
	{
		System.out.println("Constrctor 1");
	}
	StaticClass(int a)
	{
		System.out.println("Constrctor 2");
	}
	
	public static void main(String[] args)
	{
//		new StaticClass();
//		new StaticClass(9);
	}


}
