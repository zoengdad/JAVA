import java.util.Scanner;

public class TernaryOPTest {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է� : ");
		int a = stdin.nextInt();
		boolean flag;
		flag = (a % 2 == 0) ? true : false;
		System.out.print(a +"��(��)  ¦���Դϱ�? : ");
		System.out.println(flag);
	}
}