/*
��Ϊ��Ŀ�л�������е����⡣
����Щ���Ⲣδ��java����������װ����
���Զ�����Щ���е�������԰���java�������װ��˼�롣
�����е���������Զ�����쳣��װ��

�Զ����쳣
�����ڱ������У����ڳ���ʱ����Ҳ��Ϊ����ģ��޷���������ġ�
��ô����Ҫ�������������Զ����������

���ں����ڲ�������throw�׳��쳣������ô�ñ���Ҫ����Ӧ�Ĵ�������
Ҫô���ڲ�try catch����
or �ں����������õ����ߴ���

һ������£������ڳ����쳣����������Ҫ������

��ζ����쳣��Ϣ�أ�
��Ϊ�������Ѿ����쳣��Ϣ�Ĳ����������
��������ֻҪ�ڹ���ʱ��ͨ��super��佫�쳣��Ϣ���ݸ����ࡣ
�����Ϳ���ֱ��ͨ��getMessage������ȡ�Զ�����쳣��Ϣ��

�Զ����쳣��
�������Զ�����̳�Exception��

�̳�Exceptionԭ��
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���
���Ƕ��߱������ԣ������������Throwable�����ϵ�ж����ص㡣
ֻ�������ϵ�е���Ͷ���ſ��Ա�throws �� throw ������
*/

class minusException extends Exception
{
	minusException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	int div(int a,int b)throws minusException
	{
		if(b<0)
			throw new minusException("���������ˣ��������ͳ�������Ϊ����");
		return a/b;
	}
}
class defineException 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (minusException e)
		{
			System.out.println(e.toString());
			System.out.println("����Υ��������");
		}
		System.out.println("over");
	}
}
