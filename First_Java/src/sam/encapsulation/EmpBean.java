package sam.encapsulation;

//Java Bean class // VO (Value Object) // BO (Business Object) // DTO (Data Transfer Object)
public class EmpBean 
{
	//Instance Variables
	private int eid;
	private String ename;  

	//Setters method (Used to set the values to properties)
	public void seteid(int eid)
	{
		this.eid = eid;
	}
	
	public void setename(String ename)
	{
		this.ename = ename;
	}
	
	//Getter methods (Used to get the values from properties)
	public int geteid()
	{
		return eid;
	}
	
	public String getename()
	{
		return ename;
	}
}
