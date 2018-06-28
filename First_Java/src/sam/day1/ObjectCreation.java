package sam.day1;

public class ObjectCreation {

	
	/* Ways of creating object
	 * 1. New keyword
	 * 2. Instance Factory method
	 * 3. Static factory method
	 * 4. Pattern factory method
	 * 5. newInstance() method
	 * 6. clone() method
	 * 7. Dserialisation process
	 * .
	 * .
	 * .
	 * 
	 * 
	 */

//	ObjectCreation T = new ObjectCreation();
	
//	ObjectCreation ---> Class Name
//	T      -----------> Reference variable (Object Name)
//	new --------------> Keyword (Used to create object)
//	ObjectCreation()--> Constructors
	
	
	/*Rules to declare constructors
	 * Constructors name and Class Name must be same
	 * Constructors are able to take params
	 * returns type is not allowed
	 */
//	ObjectCreation()
//	{
//		//Empty - zero argument constructor or default constructor
//	}
//	Default constructor (0 argument)
//	User defined constructor(Parameterized)
	
	int empid;
	String empname;
	double sal;
	
	
	
	ObjectCreation()
	{
		this(333,"Deepak",5555.22);
		System.out.println("Default constructor");
//		empid = 111;
//		empname = "Sameer";
//		sal = 1000000.543;
//					
	}
	
	ObjectCreation(int empid,String empname,double sal)
	{
		System.out.println("parameterrized constructor");
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
	}
	
	void m1()
	{
		System.out.println("M1 method");
		System.out.println("EMP ID = " +empid);
		System.out.println("EMP NAME = " +empname);
		System.out.println("EMP SAL = " +sal);
	}
	
	public static void main(String[] args)
	{
		ObjectCreation t1 = new ObjectCreation();
		t1.m1();
		ObjectCreation t2 = new ObjectCreation(222,"Sachin",20000.543);
		t2.m1();
		
//		nameless creation on object
//		new ObjectCreation();
//		new ObjectCreation(555,"TTT",98989);
//		
	}
	/*Constructor usage
	 * 1. Constructor gets executed at the time of object creation
	 * so logic written inside constructor will get executed  
	 * 2. We can initialise values to instance variables in the constructors
	 */
	

}
