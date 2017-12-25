package inheritence;

public class Teacher extends Person 
{

	public Teacher(String firstname1, String lastname1)
	{
		super(firstname1,lastname1);
	}

	public void print()
	{
		System.out.println("This is Teacher Class");
		super.print();
	}

}
