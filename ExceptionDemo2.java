class Demo
{
	int div(int a,int b)throws Exception/�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ��������
	{
		return a/b;
	}
}
class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,1);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("over");
	}
}
