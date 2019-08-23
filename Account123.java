import java.util.Scanner;
public class Account123 
{
	//public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		//VideoStore videoStore=new VideoStore();
		int choice;
		do
		{
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Interest Calculator-SB");
			System.out.println("2.Interest Calculator-FD");
			System.out.println("3.Interest Calculator-RD");
			System.out.println("4.Exit:");
			System.out.println("Enter your choice (1..4):");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					new SB();
					break;
				case 2:
					new FD();
					break;
				case 3:
					new RD();
					break;
				case 4:
					System.out.println("Exiting...!! Thanks for using the application.");
					System.exit(0);
			}
		}while(choice!=4);
	}
}
