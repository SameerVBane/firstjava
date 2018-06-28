package sam.polymorhism;

/*Overriding methods
 * 8 Rules:
 * 1. Overridden and overriding Method signatures must be same
 * 2. Overridden and overriding Method return types must be same at primitive data type level
 * 3. It is possible to change the return types by using Covariant return type concept (Animal and Dog returns types)
 * 4. Overriding is not possible if overridden method is declared with Final keyword.
 * (Cannot override the final method from parent)
 * 5. 
 * 
 * 
 * 
 * 
 * ###### Final #######
 * 1. Final class can not be extended
 * 2. final method can not be override.
 * 3. final variable can not be reassigned. 
 * ####################
 */
class Animal{}
class Dog extends Animal{}


class parent5
{
	 Animal  marry()// overridden method
	{
		System.out.println("Marry Black color girl");
		return new Animal();
		
	}
}
class OverridingConcepts extends parent5
{
	
	Dog  marry()//Overriding method
	{
		System.out.println("Marry White color girl");
		return new Dog();
		
	}
	
	public static void main(String[] args)
	{
		new OverridingConcepts().marry();
	}
	

}
