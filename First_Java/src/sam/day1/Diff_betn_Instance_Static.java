package sam.day1;

public class Diff_betn_Instance_Static {

	static int a = 20; //Static variable
	int b = 10; //Instance variable
	
	
	public static void main(String[] args) {
		Diff_betn_Instance_Static v = new Diff_betn_Instance_Static();

		System.out.println(Diff_betn_Instance_Static.a); //20
		System.out.println(v.b); //10
		Diff_betn_Instance_Static.a = 50;
		v.b = 100;
				
		System.out.println(Diff_betn_Instance_Static.a); //50
		System.out.println(v.b); //100 
		
		Diff_betn_Instance_Static d = new Diff_betn_Instance_Static();
		System.out.println(Diff_betn_Instance_Static.a); // 50 Static variable gets single copy of memory where value gets overwritten
		System.out.println(d.b); // 10	Instance variable new memory gets assigned when new object gets created.
	}
}




