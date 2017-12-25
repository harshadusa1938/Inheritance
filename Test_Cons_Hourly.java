package inheritence;

import java.util.Scanner;

public class Test_Cons_Hourly
{
	public static void main(String[] args) 
	{
		Consultancy c=new Consultancy("Consultancy name is: "+ "Google");
		c.show();
		Hourly_Paid hp=new Hourly_Paid("Harshad");
		hp.show();
		hp.cal(40, 160);
		Bi_Weekly bw=new Bi_Weekly(null);
		//bw.cal(bi_weekly);
		
	}
	
}
