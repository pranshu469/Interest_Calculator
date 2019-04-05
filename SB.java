import java.util.*;
public class SB extends Account
{	
	static double interestRate;
	static double amount;
	static double x;
	static String typeOfAcc;
	static Scanner sc=new Scanner(System.in);
	public static void main(String... args)
	{
		//sc=new Scanner(System.in);
		System.out.println("enter the sb amount");
		amount=sc.nextDouble();
		System.out.println("enter the type of sb amount(Normal/Nri)");
		typeOfAcc=sc.next();
		
		SB obj=new SB();
		obj.calculateInterest();
	}
	
	public double calculateInterest()
	{
		if(typeOfAcc.equals("Normal"))
		{
			x = 4*amount/100;
		}
		else if(typeOfAcc.equals("Nri"))
		{
			x = 6*amount/100;
		}
		System.out.println("interest gained is "+x);
		return x;
	}
}