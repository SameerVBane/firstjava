package sam.interfaces;

public interface AbInterface {
void m1();
void m2();
void m3();

}

abstract class test1 implements AbInterface
{
	public void m1()
	{
		System.out.println("m1 mtheod");
	}
}

abstract class test2 extends  test1
{
	public void m2()
	{
		System.out.println("m2 mtheod");
	}
}

class test3 extends test2
{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 mtheod");
	}
	
	public static void main(String[] args)
	{
		test3 t = new test3();
		t.m1();
		t.m2();
		t.m3();
	}
	
}
