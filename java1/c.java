import java.util.Scanner;
interface i
{
	public void add(int a,int b);
}
interface i2
{
	public void mul(int a,int b);
}
class A implements i,i2
{
	int c,d;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println("Addition is ="+c);

	}
	public void mul(int a,int b)
	{
		d=a*b;
		System.out.println("Multiplication is ="+d);
	}
	public static void main(String arg[])
	{
		A m=new A();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no:");
		a=sc.nextInt();
		b=sc.nextInt();
		m.add(a,b);
		m.mul(a,b);
	}
}
