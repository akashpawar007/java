import java.util.Scanner;
class For 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);		
		int a[]=new int[10];
		int s=0,i;
		System.out.println("Enter the elements in arry:");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			s=s+a[i];
		}
		System.out.println("Sum="+s);
	}
}
			
