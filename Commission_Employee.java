/*package inheritence;

public class Commission_Employee 
{
	private String firstname;	
	private String lastname;
	private String ssn;
	private double gross_sales;
	private double commission_Rate;

	public Commission_Employee(String firstname,String lastname,String ssn,double gross_sales, double commission_Rate)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.ssn=ssn;
		this.gross_sales=gross_sales;
		this.commission_Rate=commission_Rate;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getSsn() 
	{
		return ssn;
	}

	public void setSsn(String ssn) 
	{
		this.ssn = ssn;
	}

	public double getGross_sales()
	{
		return gross_sales;
	}

	public void setGross_sales(double gross_sales)
	{
		this.gross_sales = gross_sales;
	}

	public double getCommission_Rate() 
	{
		return commission_Rate;
	}

	public void setCommission_Rate(double commission_Rate)
	{
		this.commission_Rate = commission_Rate;
	}


	public void setGrossSales(double sales)

	{
		try
		{
			if(sales>=0.0)
				gross_sales=sales;
		}
		catch(Exception e)
		{
			System.out.println("Gross Sales Must be >=0.0" +e.getMessage());	
		}
	}

	public double getGrossSales()
	{
			return GrossSales;

	}
}
*/