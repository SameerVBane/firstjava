package sam.day1;

public class Variables {

	static int a = 20; //Static variable
	int b = 10; //Instance variable
	
	 void m1() {
		System.out.println(" M1  Static variable a = " +Variables.a);
		
		Variables v = new Variables();
		
		System.out.println("M1 Instance variable b = " +v.b);
	}
		
	public static void main(String[] args) {
		
		int c = 5;//local variable
		
		Variables v = new Variables();
		
		v.m1();
	
		System.out.println("Local variable c = " +c );
		System.out.println("Static variable a = " +Variables.a);
		
		Variables h = new Variables();
		System.out.println("instance variable b =" +h.b);
	}
}




