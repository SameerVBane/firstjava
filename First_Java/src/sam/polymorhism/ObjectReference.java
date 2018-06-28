package sam.polymorhism;

class Parent
{
	void m1() //overridden method
	{
		System.out.println("parent m1 method");
	}
}

class ObjectReference extends Parent
{
	void m1() //overriding method
	{
		System.out.println("child m1 method");
	}
	
	void m2() //Direct method
	{
		System.out.println("child m2 method"); 
	}
	
	public static void main(String[] args)
	{
		Parent p = new ObjectReference();
		p.m1(); // Compile time parent class method m1 is present but at runtime child class method Mm1 will be executed
		//p.m2(); // Compile time there is no m2 method in parent class so compiler error
		
		ObjectReference c = (ObjectReference) p;  // type casting
		c.m2();
		
		//
		
		
		WebDriver driver = new FireFoxdriver();
		driver.get();// compile time webdriver so no error
		driver.window();// compile time webdriver so no error
		//driver.x // Compilation error  as x method not present in WebDriver. So only overriding methods call is possible 
		FireFoxdriver f = (FireFoxdriver) driver; //type casting 
		f.x();
	}

}

interface WebDriver
{
	void get(); 
	void window();
}

class FireFoxdriver implements WebDriver
{
	public void get() {//overriding method
	}
	public void window() {//overriding method
	}
	
	void x()//direct method
	{
	}
	
	
	
}


