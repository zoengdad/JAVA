public class ArithmeticOPTest1 {
	public static void main(String args[]) 
	{
		int a=5, b=2 ;
		int sum=a+b;
		System.out.println("a+b=" + sum);
		int sub=a-b;
		System.out.println("a-b=" + sub);
		int mul=a*b;
		System.out.println("a*b=" + mul);
		int div=a/b;
		System.out.println("a/b=" + div);
		int mod=a%b;
		System.out.println("a%b=" + mod);
		int c = ++a; // int c = ++5; ���´� ��� �Ұ�
		System.out.println("a�� ���� ���� ����(prefix)="+c);
		System.out.println("a ������ �� : "+a);
		int d = b++;
		System.out.println("b�� ���� ���� ����(postfix)="+d);
		System.out.println("b ������ �� : "+b);
	}
}