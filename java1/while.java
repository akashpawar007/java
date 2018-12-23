
import java.util.Scanner;
class While 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i=0,s=0;
		System.out.println("Enter the elements in array:");
		while(i<5)
		{
			a[i]=sc.nextInt();
			i++;
		}
		for(i=0;i<5;i++)
		{
			s=s+a[i];
			//i=i++;
		}
		System.out.println("Sum is="+s);
	}
}
