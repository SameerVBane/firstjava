package sam.day1;

class X{}
class Y{}
class Emp1{}
class Product{}

public class MethodsConcepts2 {
	
	void instance_method(X x,Emp1 e) 
	{
		System.out.println("Instance menthod" );
	}
	
	
	 void instance_method(Y y, Product p) 
	{
		System.out.println("Static menthod" );
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		MethodsConcepts2 t = new MethodsConcepts2();
		X b = new X();
		Emp1 c = new Emp1();
		t.instance_method(b,c);
				
		t.instance_method(new Y(),new Product());		
		
	}

}
