package sam.interfaces;

public interface NestedInterface {
	int a =100;
	interface it1
	{
		int a=200;
		void m1();
	}

}

class Test456 implements NestedInterface.it1,NestedInterface
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
		System.out.println(it1.a);
		System.out.println(NestedInterface.a);
	}
	public static void main(String[] args)
	{
		new Test456().m1();
	}
}