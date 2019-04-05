import java.util.*;
public class RD extends Account
{	
	static int noOfMonths;
	static double amount;
	static double interestRate;
	static double monthlyAmount;
	static int ageOfACHolder;
	static double x;
	public double calculateInterest()
	{
		if(ageOfACHolder<=60)
			{
			if(noOfMonths<6)
				interestRate=7.50;
			else if(noOfMonths>6 && noOfMonths<=9)
				interestRate=7.75;
			else if(noOfMonths>9 && noOfMonths<=12)
				interestRate=8.00;
			else if(noOfMonths>12 && noOfMonths<=15)
				interestRate=8.25;
			else if(noOfMonths>15 && noOfMonths<=18)
				interestRate=8.50;
			else if(noOfMonths>18 && noOfMonths<=21)
				interestRate=8.75;
			}
			else
			{
			if(noOfMonths<6)
				interestRate=8.00;
			else if(noOfMonths>6 && noOfMonths<=9)
				interestRate=8.25;
			else if(noOfMonths>9 && noOfMonths<=12)
				interestRate=8.50;
			else if(noOfMonths>12 && noOfMonths<=15)
				interestRate=8.75;
			else if(noOfMonths>15 && noOfMonths<=18)
				interestRate=9.00;
			else if(noOfMonths>18 && noOfMonths<=21)
				interestRate=9.25;
			}

		x = interestRate*amount/100;
		System.out.println("interest gained is "+x);
		return x;
	}
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the rd amount");
	amount=sc.nextDouble();
	
	System.out.println("enter the no. of months ");
	noOfMonths=sc.nextInt();
	
	System.out.println("enter your age");
	ageOfACHolder=sc.nextInt();
	
		RD obj=new RD();
		obj.calculateInterest();
		
	}
}