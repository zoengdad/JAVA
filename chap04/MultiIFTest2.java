import java.util.Scanner;
public class MultiIFTest2 {
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
		else if (count == 0)
			System.out.print("�Էµ� ���� 0 �Դϴ�");
		else
		{
			System.out.print("�Էµ� �� " + count);
			System.out.println("��(��) ����Դϴ�");
		}
	}
}