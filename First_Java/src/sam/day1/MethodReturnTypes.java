package sam.day1;

class emp{}

public class MethodReturnTypes {
	
	MethodReturnTypes g()
	{
		return this;
	}
	
	int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	float add(float d, float e)
	{
		float r = d+e;
		return r;
	}
	
	static char m1()
	{
	return 'P';	
	}
	
	emp employee()
	{
	emp e = new emp();
	return e;
	}
	public static void main(String []args)
	{
		MethodReturnTypes t = new MethodReturnTypes();
		int s = t.add(12, 1);
		System.out.println(s);
		
		float w = t.add(2.2f, 3.3f);
		System.out.println(w);
		
		System.out.println(MethodReturnTypes.m1());
		emp e1 = t.employee();
		
		
		MethodReturnTypes e2 = t.g();
	}

}
