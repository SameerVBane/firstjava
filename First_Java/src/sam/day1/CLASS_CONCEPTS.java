package sam.day1;

public class CLASS_CONCEPTS {
	
	//************Variables****************************
	
	int a; 			//Instance Variable
	static int b; 	//static variable
	
	//**************************************************
	
	//************Methods******************************
	void m1()		//instance method
	{
		System.out.println("Instance Method M1");
	}
	
	static void m2()    //Static Method
	{
		System.out.println("Static Method m2");
	}
	//*************************************************
	
	//***********Constructors***************************
	
	CLASS_CONCEPTS()	//Default Constructor
	{
		System.out.println("Default Constructor");
	}

	CLASS_CONCEPTS(int z)	//User Defined constructor
	{
		System.out.println("User Defined Constructor");
	}
	//***************************************************
	
	//*********Instance block***************************
	{
		a = 100;
		CLASS_CONCEPTS.b = 200;
		System.out.println("Instance block");
	}
	//**************************************************
	
	//***********Static Block *************************
	static
	{
		new CLASS_CONCEPTS().a = 500;
		CLASS_CONCEPTS.b = 600;
		System.out.println("Static block");
	}
	//*************************************************
	
	public static void main(String[] args)
	{
		System.out.println("Static variable " + CLASS_CONCEPTS.b);
		
		CLASS_CONCEPTS t = new CLASS_CONCEPTS();
		t.m1();
		System.out.println("Instance variable " +t.a );
		System.out.println("Static variable " + CLASS_CONCEPTS.b);
		
		CLASS_CONCEPTS.m2();
		new CLASS_CONCEPTS(9);
		
		System.out.println("Instance variable " +t.a );
		System.out.println("Static variable " + CLASS_CONCEPTS.b);
	}
}
