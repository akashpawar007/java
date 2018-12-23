import java.util.Scanner;

interface A
{

	public void name(String s);
}


interface B
{
 	public void address(String m);
}

public class Interface implements A,B
{

	public void name(String s)
	{
		System.out.println("Name is"+s);
	}

	
	public void address(String m)
	{
		System.out.println("Address is"+m);
	}
	
		
	public static void main(String []args)
	{

		Interface f1= new Interface();		
		f1.name("saurabh kshirsagar");
		f1.address("solapur");
	}

}
