class Mydate
{
	int d,m,y;
	public Mydate()
	{
		d=10;
		m=10;
		y=1998;
	}
	public Mydate(int d,int m,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
		System.out.println("D="+this.d+"M="+this.m+"Y="+this.y);
	}
}
class Main
{
	public static void main(String arg[])
	{
		Mydate m=new Mydate(1,1,1999);
	}
}
