final class Final
{
	final void show()
	{
		System.out.println("Hello World");
	}
	public static void main(String arg[])	
	{
		Final f=new Final();
		f.show();	
	}
}
class Abc extends Final
{
	void show()
	{
		 System.out.println("Hello");
	}
}
