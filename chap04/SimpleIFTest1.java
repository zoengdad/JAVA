import java.util.Scanner;
public class SimpleIFTest1 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է� : ");
		int count = stdin.nextInt();
		if (count < 0)
			System.out.println(count + "��(��) �����Դϴ� ");
    }
}	