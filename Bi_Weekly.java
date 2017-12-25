package inheritence;

public class Bi_Weekly extends Hourly_Paid
{
	int total;
	int bi_weekly;
	public Bi_Weekly(String firstname)
	{
		super(firstname);
	}
	
	public void cal(int bi_weekly)
	{
	this.bi_weekly=bi_weekly;
	bi_weekly = (total/30)*7;
	System.out.println("Bi-Weekly Salary Rate is: "+ bi_weekly);
	
}
}
