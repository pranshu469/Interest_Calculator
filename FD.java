import java.util.*;
public class FD extends Account
{	
	static int noOfDays;
	static int ageOfACHolder;
	static double amount;
	static double interestRate;
	static double x;
	
	public double calculateInterest()
	{
		if(amount<10000000)
		{
		if(ageOfACHolder<60)
		{
			if(noOfDays>7 && noOfDays<14)
				interestRate=4.50;
			else if(noOfDays>15 && noOfDays<29)
				interestRate=4.75;
			else if(noOfDays>30 && noOfDays<45)
				interestRate=5.50;
			else if(noOfDays>45 && noOfDays<60)
				interestRate=7.00;
			else if(noOfDays>61 && noOfDays<184)
				interestRate=7.50;
			else if(noOfDays>185 && noOfDays<365)
				interestRate=8.00;
		}
		else
		{
			if(noOfDays>7 && noOfDays<14)
				interestRate=5.00;
			else if(noOfDays>15 && noOfDays<29)
				interestRate=5.25;
			else if(noOfDays>30 && noOfDays<45)
				interestRate=6.00;
			else if(noOfDays>45 && noOfDays<60)
				interestRate=7.50;
			else if(noOfDays>61 && noOfDays<184)
				interestRate=8.00;
			else if(noOfDays>185 && noOfDays<365)
				interestRate=8.50;
		}
		}
		else
		{
			if(noOfDays>7 && noOfDays<14)
				interestRate=6.50;
			else if(noOfDays>15 && noOfDays<29)
				interestRate=6.75;
			else if(noOfDays>30 && noOfDays<45)
				interestRate=6.75;
			else if(noOfDays>45 && noOfDays<60)
				interestRate=8.00;
			else if(noOfDays>61 && noOfDays<184)
				interestRate=8.50;
			else if(noOfDays>185 && noOfDays<365)
				interestRate=10.00;
		}
		x = interestRate*amount/100;
		System.out.println("interest gained is "+x);
		return x;
	}
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the fd amount");
	amount=sc.nextDouble();
	
	System.out.println("enter the no. of days");
	noOfDays=sc.nextInt();
	
	System.out.println("enter your age");
	ageOfACHolder=sc.nextInt();
	
		FD obj=new FD();
		obj.calculateInterest();
		
	}
}