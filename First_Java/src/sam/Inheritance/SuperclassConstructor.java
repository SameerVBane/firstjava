package sam.Inheritance;

class parent1
{
	parent1()
	{
		System.out.println("Parent class constructor");
	}
}



public class SuperclassConstructor extends parent1{
//	SuperclassConstructor()
//	{
////		this(10); // this keyword must be 1st statement inside constructor
//		System.out.println("Child  class default constructor");	
//	}
//	
//	SuperclassConstructor(int a)
//	{
////		super(1); // super keyword must be 1st statement inside constructor
//		System.out.println("Child  class user defined constructor");	
//	}
	
	public static void main(String[] args)
	{
	new SuperclassConstructor();	
//	new SuperclassConstructor(1);	
	}

}
