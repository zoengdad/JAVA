public class LogicalOPTest {
	public static void main(String args[]) 
	{
		boolean a;
		a = (20 > 10) || (30 > 40);
		System.out.println("20�� 10���� ũ�ų� �Ǵ�(���� ||) 30�� 40���� ū��? " + a);
		a = (20 > 10) && (30 > 40);
		System.out.println("20�� 10���� ũ�� �׸���(���� &&) 30�� 40���� ū��? " + a);
		a = ! true;
		System.out.println("ture�� !(not)��? " + a);
		System.out.println("20�� 10���� ũ�ų� �Ǵ�(���� ||) 30�� 40���� ū��? " + ((20 > 10) || (30 > 40)));
		System.out.println("20�� 10���� ũ�� �׸���(���� &&) 30�� 40���� ū��? " + ((20 > 10) && (30 > 40)));
		System.out.println("ture�� !(not)��? " + (! true));		
	}
}