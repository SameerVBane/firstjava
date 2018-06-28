package sam.interfaces;

public interface AdapterClass {
	
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
}

class X implements AdapterClass //Adapter class contains empty implementations of interface methods
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}
	
}

class Y extends X
{
	public void m1()
	{
		System.out.println("Only M1 method impementd here");
	}
	public static void main(String[] args)
	{
		new Y().m1(); 
	}
}