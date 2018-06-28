package sam.Inheritance;

class parent2
{
	{
		System.out.println("Parent class intance block");
	}
	parent2()
	{
		System.out.println("parent class constructor");
	}
}

public class ParentclassInstanceBlocks extends parent2
{
	{
		System.out.println("Child class intance block");
	}
	ParentclassInstanceBlocks()
	{
		System.out.println("Child class constructor");
	}
	public static void main (String[] args)
	{
		new ParentclassInstanceBlocks();
		
	}
}
