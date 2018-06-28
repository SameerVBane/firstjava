package sam.polymorhism;

abstract class Abstractions { //Abstract classes may or may not contains abstarct methods .
	//Object of abstract class can not be created
	
	
	/* 
	 * How to prevent inheritance?
	 * Ans- Declare class as final
	 * 
	 * How to prevent overriding methods?
	 * Declare method with final
	 * 
	 * How to prevent object creation of class?
	 * Declare class with abstarct modifier
	 * 
	 */
	abstract void m1();
	
	void m2()
	{
		System.out.println("Normal m2 method of abstarct class ");
	}
	

}

class childabstarct extends Abstractions
{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract menthod m1 implementd in normal child class");
	}	
	
	public static void main (String[] args)
	{
//		Abstractions ab = new Abstractions();
		childabstarct chab = new childabstarct();
		chab.m1();
		chab.m2();
		
		Abstractions ab = new childabstarct();
		ab.m1();ab.m2(); // Compile time: parent methods will be cheched   Runtime: child methods will be executed
		
	}
	
}
