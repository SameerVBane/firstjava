package sam.interfaces;

public interface MarkerInterface {

	
	//Marker Interface does not contain any methods. 
	//But it has some Capabilities provided by JVM which can be used by classes
	//Object cloning is the example below
}


class Test654  implements Cloneable 
{
	int a = 100;
	int b = 200;
	public static void main (String[] args) throws CloneNotSupportedException
	{
		Test654 T = new Test654();
		System.out.println(T.a);
		System.out.println(T.b);
		T.a = 300;
		T.b = 400;
		Test654 T1 =(Test654)T.clone();
		T1.a = T.a;
		T1.b = T.b;
		System.out.println(T.a);
		System.out.println(T.b);
		T.a = 500;
		T.b = 600;
		System.out.println(T.a);
		System.out.println(T.b);
		System.out.println(T1.a);
		System.out.println(T1.b);
	}
	
}