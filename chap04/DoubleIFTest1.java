import java.util.Scanner;
public class DoubleIFTest1 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int grade = stdin.nextInt();
/*		if (grade >= 90)
			System.out.println("A���� ��� ����");
		else
			System.out.println("A���� ��� ����"); */	
		System.out.println((grade >= 90) ? "A���� ��� ����" : "A���� ��� ����");

		System.out.println("�����մϴ�");	
	}
}