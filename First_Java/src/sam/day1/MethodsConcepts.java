package sam.day1;

public class MethodsConcepts {
	
	void instance_method(int a, char b) 
	{
		System.out.println("Instance menthod interger " +a  +" Character " +b);
	}
	
	static void static_method(String str, double d) 
	{
		System.out.println("Static menthod String  " + str + " double value  " +d);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		MethodsConcepts t = new MethodsConcepts();
		t.instance_method(12,'S');
				
		MethodsConcepts.static_method("STRING PARAM", 1222.777);		
		
	}

}
