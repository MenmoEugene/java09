/*
�����ڲ��ࣺ
1.	�����ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2.	���������ڲ����ǰ�᣺
		�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�
*/
abstract class AbsDemo
{
	abstract void show();
}
class Outer
{
	private int x = 3;
	class Inner
	{
		public void show()
		{
			System.out.println("x="+x);
		}
	}
	public void function()
	{
		new Inner().show();
	}
}
class hideInner 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
