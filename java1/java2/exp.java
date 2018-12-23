class Exp
{
	public static void main(String arg[])
	{
		int i=4;
		try
		{
			i=i/0;
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		System.out.println("i="+i);
	}
}
