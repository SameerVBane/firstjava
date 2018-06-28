package sam.encapsulation;

public class ClientClass 
{
	
	public static void main(String[] args)
	{
		EmpBean e = new EmpBean();
		e.seteid(5159);
		e.setename("Sameer Bane");
		System.out.println(e.geteid());
		System.out.println(e.getename());
		
		EmpBean e1 = new EmpBean();
		e1.seteid(6666);
		e1.setename("xyz abc");
		System.out.println(e1.geteid());
		System.out.println(e1.getename());
		
	}

}
