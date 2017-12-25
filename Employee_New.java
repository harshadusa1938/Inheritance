package inheritence;
//Here Four Sub Class which are Consultancy,Bi-Weekly, Hourly_Paid, Find_Rate, Test_Cons_Hourly

public class Employee_New 
{
	String firstname;
	//String lastname;

	public Employee_New(String firstname)
	{
		this.firstname=firstname;
		//this.lastname=lastname;
	}
	
	public void show()
	{
		System.out.println(" "+ firstname);
	}
}
