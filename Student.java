package inheritence;

public class Student extends Person
{
	private float gpa;
	public int graduate_year;
	
	public Student(String firstname1,String lastname1, float gpa,int graduate_year)
	{
		super(firstname1, lastname1);
		this.gpa=gpa;
		this.graduate_year=graduate_year;
	}
	
	public void print()
	{
		System.out.println("Graduate Year...");
		System.out.println(""+firstname1+" "+ lastname1);
		System.out.println("GPA:" + gpa);
		System.out.println("Graduate_Year:"+ graduate_year);
		
		
	}

}