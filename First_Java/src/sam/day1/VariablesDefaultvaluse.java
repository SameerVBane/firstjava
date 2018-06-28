package sam.day1;

public class VariablesDefaultvaluse {

	 /* Primitive Data Types and default value:
	 *  byte   0,
	 *  Short   0,
	 *  int   0,
	 *  float  0.0,
	 *  double   0.0,
	 *  char     single space,
	 *  Boolean   False,
	 */
	
	// Default value of class in NULL
	
	byte p;
	short q;
	int r;
	float s;
	double t;
	char u;
	boolean v;
	
	
	
	public static void main(String[] args) {
		
		VariablesDefaultvaluse vd = new VariablesDefaultvaluse();
		System.out.println("byte " +vd.p);
		System.out.println("short " +vd.q);
		System.out.println("int " +vd.r);
		System.out.println("float " +vd.s);
		System.out.println("double " +vd.t);
		System.out.println("char" +vd.u+ "SINGLE SPACE");
		System.out.println("boolean " +vd.v);
}
}



