import java.util.Scanner;
class Akash
{	int a,b;
	void add(int a,int b)
	{
		
		this.a=a;
		this.b=b
		c=this.a+this.b;
		System.out.println("Sum is "+c);
	}
}
class Pawar extends Akash
{
	void disp(int a,int b)
	{	
		super.add(int a,int b);
	}
}
class This
{
	public static void main(String arg[])
	{
		int a,b;
		Pawar p=new Pawar();
		Scanner sc=new Scanner(system.in);
		Sytem.out.println("Enter the nos");
		a=sc.nextInt();
		b=sc.nextInt();
		p.disp(a,b);
	}
}
		


