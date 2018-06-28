package sam.Inheritance;


class parent3
{
	static
	{
		System.out.println("Parent class Static block");
	}
	
	parent3()
	{
		System.out.println("parent class constructor");
	}
}
public class PrentClassStaticBlocks extends parent3
{
	
	static
	{
		System.out.println("child class Static block");
	}
	
	PrentClassStaticBlocks()
	{
		System.out.println("child class constructor");
	}
	public static void main(String[] args)
	{
		new PrentClassStaticBlocks();
		new PrentClassStaticBlocks();
	}

}
