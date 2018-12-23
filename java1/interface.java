import java.util.Scanner;
interface i1
{
	public void add(int a,int b);
}
interface i2
{
	public void mul(int a,int b);
	//public void disp();
}
public class Interface implements i1,i2
{
	public void add(int a,int b);
	{
		int c;
		c=a+b;
		System.out.println("Addition is ="+c);
	}
	public void mul(int a,int b);
	{
		int c;
		c=a*b;

		System.out.println("Multiplication is ="+c);
	}
		
	public static void main(String arg[])
	{
		int a,b;
		Interface i=new Interface();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nos :");
		a=sc.nextInt();
		b=sc.nextInt();
		i.add(a,b);
		i.mul(a,b);
		i.disp();
	}
}
