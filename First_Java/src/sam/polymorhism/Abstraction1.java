package sam.polymorhism;

abstract class Abstraction1 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

abstract class dev1knowsM1 extends Abstraction1
{
	void m1()
	{
		System.out.println("m1 method implementd by developer 1");
	}
}

abstract class dev2knowsM2 extends dev1knowsM1
{
	void m2()
	{
		System.out.println("m2 method implementd by developer 2");
	}
	public static void main (String [] args)
	{
		Abstraction1 ab = new dev3knowsM3();
		ab.m1();
		ab.m2();
		ab.m3();
	}
}

class dev3knowsM3 extends dev2knowsM2
{

	@Override
	void m3()
	{
		System.out.println("m3 method implementd by developer 3");
	}
	
//	public static void main (String [] args)
//	{
//		Abstraction1 ab = new dev3knowsM3();
//		ab.m1();
//		ab.m2();
//		ab.m3();
//	}
}