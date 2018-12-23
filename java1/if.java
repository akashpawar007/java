import java.util.Scanner;
class If
{
	public static void main(String arg[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("No is even");
		}
		else 
		{
			System.out.println("No is odd");
		}
	}
}
