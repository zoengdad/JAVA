import java.util.Scanner;
public class SimpleIFTest4 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int grade = stdin.nextInt();
		if (grade >= 90)
			System.out.println("�����մϴ� ");
			System.out.println("A������ ����ϼ̽��ϴ� ");
		System.out.println("�����մϴ�");
	}
}