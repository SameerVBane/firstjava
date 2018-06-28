package sam.day1;

public class InstanceBlocks {
	
	/*Instance blocks are used to write logics 
	 * similar to contructor they get initilize when object is created
	 * Instance block executed 1st and then Constructor
	 * 
	 * Syntax
	 * {
	 * 
	 *write logic here
	 * }
	 * 
	 */
	int empid;
	InstanceBlocks()
	{
		this (10);
		System.out.println("Constructor Body 1");
	}
	InstanceBlocks(int a)
	{
		System.out.println("Constructor Body 2");
	}
	
	{
		empid = 111;
		System.out.println("Instance block 1");
	}
	{
		empid = 222;
		System.out.println("Instance block 2");
	}
	void disp()
	{
		System.out.println(empid);
	}
	public static void main(String[] args)
	{
		new InstanceBlocks().disp();
//		new InstanceBlocks();
//		new InstanceBlocks();
	}

}
