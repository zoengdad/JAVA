public class RelationalOPTest {
	public static void main(String args[]) 
	{
		byte a = 20;
		double d = 3.14;
		boolean flag;
		flag = a > d;
		System.out.println("a�� d���� ū��? " + flag);
		flag = a == 20.0f;
		System.out.println("a�� 20.0f�� ������? " + flag);
		flag = 10 != 10.0;
		System.out.println("10�� 10�� ���� ������? " + flag);
		flag = 10 <= 20;
		System.out.println("10�� 20���� �۰ų� ������? " + flag);
		System.out.println("10�� 20���� ������? " + (10 < 20));
		System.out.println("10�� 20���� ũ�ų� ������? " + (10 >= 20));		
	}
}