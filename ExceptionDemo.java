class Demo
{
	int div(int a,int b)
	{
		return a/b;
	}
}
class ExceptionDemo
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
