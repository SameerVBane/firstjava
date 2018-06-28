package sam.day1;


public class A {
	
	static
	{
		System.out.println("Static Block - A");
	}
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("B");
		
		Class.forName("C"); 
		
	}


}

