package sam.polymorhism;

public class Polymorhism {
	
	/*######### Polymorphism#############################################################
	 * One person with many behaviors. 
	 * One thing in Many forms.
	 * Its Greek word  
	 * 
	 * 
	 * Types of polymorphism
	 * 1. Compile time polymorphism / Static binding / early bindig
	 * E.g., Method overloading
	 * 
	 * #####Overloading##############
	 * - Method overloading
	 * 		 
	 * - Constructor overloading
	 * 
	 * - Operator overloading
	 * Java does not support operator overloading. But implicitly + operator overloading is supported by JVM
	 * ###############################
	 * 
	 * 
	 * 2. Runtime Polymorphism/ Dynamic binding / Late binding
	 * e.g, Method Overriding
	 * 
	 * ######################################################################################
	 */
	
	//######### Constructor Overloading ######################
	Polymorhism(int a)
	{
		System.out.println("Int type arg constructor");
	}
	
	Polymorhism(char b)
	{
		System.out.println("Char type arg constructor");
	}
	
	//#####################################################
	
	//########### Method overloading ###################
	void m1(int a)
	{
		System.out.println("One arg M1 method");
	}
	
	void m1(int a, int b) 
	{
		System.out.println("Two arg M1 method");
	}
	void m1(char c) 
	{
		System.out.println("Char type arg M1 method");
	}
	//##################################################
	
	public static void main(String [] args)
	{
		Polymorhism p = new Polymorhism(10);
		p.m1(10);
		p.m1(10,20);
		p.m1('s');
		new Polymorhism('B');
		
		//Operator overloading
		System.out.println(10+20);
		System.out.println("Sameer" + " Bane");
	}
}
