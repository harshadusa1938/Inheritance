package inheritence;

//Here is Three class Person, Teacher and Student

public class Person
{
	String firstname1;
	String lastname1;
	
	public Person(String firstname1, String lastname1)
	{
		this.firstname1=firstname1;
		this.lastname1=lastname1;
	}
	
	public void print()
	{
		System.out.println("This is Person Class...");
		System.out.println(" "+firstname1+ " "+ lastname1);
	}
}
