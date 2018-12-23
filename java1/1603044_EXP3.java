import java.util.Scanner;	//importing Scanner class
class Class
{
	int x=10,y=20;
		
	void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:");
		System.out.println("A=:"+a);
		System.out.println("B="+b);
	}
	
			
}
class Object
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);	//creating object for Scanner class
		int a,b,s=0;
		Class c=new Class();
		s=c.x+c.y;				//accessing member of class Class object
		System.out.println("Sum is="+s);
		System.out.println("Enter the 1st no:");
		a=sc.nextInt();
		System.out.println("Enter the 2nd no:");
		b=sc.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("A=:"+a);
		System.out.println("B="+b);
		
		
		c.swap(a,b);				//calling swap method
	}
}
		
