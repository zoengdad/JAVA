import java.util.Scanner;
public class DoubleIFTest2 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		int count = stdin.nextInt();
		if (count < 0 )
		{
			System.out.print("�Էµ� �� " + count);
			System.out.println("��(��) �����Դϴ�");
		}
		else
		{
			System.out.print("�Էµ� �� " + count);
			System.out.println("��(��) ������ �ƴմϴ�");
		}
	}
}