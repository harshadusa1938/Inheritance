package inheritence;

public class Hourly_Paid extends Employee_New

{
	public int rate;
	public int hours;
	public int total;
//	
	public Hourly_Paid(String firstname)
	{
		super(firstname);
		
	}
	
	public void cal(int rate,int hours)
	{
		int total;
		total=rate*hours;
		System.out.println("Total Per Month Salary is: "+total);
		System.out.println("Rate is: "+ rate);
		System.out.println("Hours is:"+hours);
		
		
		//---Bi-Weekly--
		
		int bi_weekly = (total/30)*7;
		System.out.println("Bi-Weekly Salary Rate is: "+ bi_weekly);
		
		
		int comm=(bi_weekly*10)/100;
		System.out.println("10 % Commission : "+ comm);
	}
	
	public void show()
	{
		//System.out.println("Hourly Paid.");
		super.show();
	}
	
}
