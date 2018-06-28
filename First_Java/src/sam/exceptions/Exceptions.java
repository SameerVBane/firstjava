package sam.exceptions;


// Types of exceptions:
//	1. Checked
//	2. unchecked
//	3. error
//	
//	try
//  catch
//  finally
//  throw
//  throws
public class Exceptions {
	
	//UnChecked exception
	//The exceptions which are not checked at compile time are called unchecked exception
	//These creates problem at runtime 
	public static void main(String[] args) throws InterruptedException
	{
//	System.out.println("Hello 1");
//	System.out.println("Hello 1");
//	System.out.println("Hello 1");
//	System.out.println(10/0);//Airthmatic exception
//	System.out.println("Hello 1");
//	System.out.println("Hello 1");
	
	//Checked exception
	//The exception which are checked at compile time are called checked exception
	
	System.out.println("Hello 1");
	System.out.println("Hello 1");
	System.out.println("Hello 1");
	Thread.sleep(2000);;//Airthmatic exception
	System.out.println("Hello 1");
	System.out.println("Hello 1");
	
	}

}
