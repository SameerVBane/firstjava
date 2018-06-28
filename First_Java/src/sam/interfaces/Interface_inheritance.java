package sam.interfaces;

public interface Interface_inheritance 
/*class extends class
 * interface extends interface
 * class implements interface
 * 
 * class A extends class B --Valid
 * class A extends class B,C --Invalid
 * class A implements It1 -- valid
 * class A implements It1, It2 -- Valid
 * class A extends class A ---Invalid
 * 
 * interface It1 extends It2  --- valid
 * interface It1 extends It1,It2  --- Valid
 * interface It1 extends class A ---Invalid
 * interface It1 extends It1 -- Invalid
 * 
 * class A extends class B implements It1, It2  --Valid
 * class A implements It1,It2 extends class B    ---invalid   //Extends keyword 1st
 */
{
	void m1();

}

interface It1 extends Interface_inheritance
{
	void m2();
}

interface It2 extends It1
{
	void m3();
}

class test123 implements It2
{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	
}

