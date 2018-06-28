package sam.polymorhism;

abstract class AbstractInstanceBlock {
	
	{
		System.out.println("Instace block");
	}

	static {System.out.println("Static block");}
}

class T extends AbstractInstanceBlock
{
	public static void main(String[] args)
	{
//		T t = new T();
	
	}
}