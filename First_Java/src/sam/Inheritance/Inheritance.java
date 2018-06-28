package sam.Inheritance;

class A
{
	void m1()
	{
		System.out.println("M1 method");
	}
	void m2()
	{
		System.out.println("M2 method");
	}
}

class B extends A
{
	void m3()
	{
	System.out.println("M3 method");
	}
}

class C extends B
{
	void m4()
	{
	System.out.println("M4 method");
	}
	
}
public class Inheritance {
	
	
/*OOps concepts
 * 1. Inheritance
 * 2. Polymorphism
 * 3. Abstraction
 * 4. Encapsulation
 * 5. class
 * 6. object
 * 
 * 
 * Class vs Object
 * 
 * 1. Class is a logical entity contains logic of the application 
 * 	  Object is a physical entity it is allocating memory
 * 2. Without class there is no object
 * 3. Based on single class it is possible to create multiple objects
 * 4. Class keyword ...New keyword
 */
	
	/*#*************************INHERITANCE*************************************************
	 * DEFn:-Process of acquiring properties and behaviors from one class to another class
	 * Inheritance is also known as easy relationship
	 * 
	 * 1. It avoids duplicate/redundant code
	 * 2. Reduces length of the code
	 * 
	 * Achieve inheritance by extends keyword
	 * 
	 * Application without inheritance
	 * classA
	 * {
	 * void M1(){}
	 * Void M2(){}
	 * }
	 *  class B
	 *  {
	 *  void M1(){}
	 *  void M2(){}
	 * 	void M3(){}
	 * 	void M4(){}
	 * }
	 * 
	 * class C
	 * {
	 *  void M1(){}
	 *  void M2(){}
	 * 	void M3(){}
	 * 	void M4(){}
	 * 	void M5(){}
	 * 	void M6(){}
	 * 
	 * 
	 * Application with Inheritance
	 * classA   //Parent class or super class or base class
	 * {
	 * void M1(){}
	 * Void M2(){}
	 * }
	 *  class B extends A // child class or sub class or derived class
	 *  {
	 *  M1();
	 *  M2();
	 *  void M3(){}
	 * 	void M4(){}
	 * }
	 * class C extends B //One class is able to extend only single class. So multiple inheritance is not possible
	 * {
	 * M1();
	 * M2();
	 * M3();
	 * M4();
	 * void M5(){}
	 * void M6(){}
	 * }
	 * 
	 * #******************************************************************************************
	 * 
	 * ##########NOTES###########################################################
	 * BY DEFALUT class is extends OBJECT class-----
	 * Root class in JAVA is OBJECT class----
	 * Every class is=n java in directly or indirectly child class of OBJECT class
	 * OBJECT Calss belongs to---> java.lang package
	 * ##########################################################################
	 * 
	 * 
	 * ############  Types of Inheritance  ###############################
	 * 1. Single  A--> B
	 * 2. Multilevel   A--> B---> C
	 * 3. Hierarchical  	A			A --> B	      A --> C		A --> D
	 * 					B   C   D
	 * 
	 * 4. Multiple inheritance is not possible in JAVA as any one class can extends only one class. Not possible because it Generates Ambiguity issue.
	 * 5. Hybrid inheritance is also not supported as it is a combination of Multiple and Hierarchical 
	 * #################################################################
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		A a = new  A();
		a.m1();
		a.m2();
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
	
	/* Prevent Inheritance
	 * use Final modifier
	 * final class B{}
	 * 
	 * 
	 * 
	 */
	

}
