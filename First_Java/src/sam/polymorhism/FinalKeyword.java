package sam.polymorhism;

final class FinalKeyword {
	
	int a = 10; //final class variables not a final
	
	void m1() // Final class methods are by default final
	{
		a = a+10;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		new FinalKeyword().m1();
	}
	

}
