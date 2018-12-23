import java.util.Scanner;
class Over
{
	int a,b; 
	void area(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c=0;
		//Scanner sc=new Scanner(System.in);
		c=2*this.a*this.b;
		System.out.println("Area of Rectangle="+c);
	}
		
}
class Rectangle extends Over
{
	Scanner sc=new Scanner(System.in);	
	void display()
	{
		int a,b;
		
		System.out.println("In Rectangle class");
		area();
		System.out.println("Enter length and breadth of rectangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		super.area(a,b);
	}
	void area()
	{
		int s,x;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side of Square");
		x=sc.nextInt();
		s=x*x;
		System.out.println("Area of Square="+s);
	}
	public static void main(String arg[])
	{
		Rectangle r=new Rectangle();
		
		r.display();
	}
}
