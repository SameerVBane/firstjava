package sam.day1;

public class AddMethod {
	int x = 100;//instance variables
	int y = 200;
	
	void add(int x, int y)//local variable
	{
		System.out.println(this.x+this.y);//300
		System.out.println(x+y);//3000
	}

	public static void main(String[] args)
	{
		AddMethod t = new AddMethod();
		t.add(1000,2000);
	}
}


