import java.util.Scanner;
public class DoWhileTest2 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		int month;
		do {
			System.out.print("\n���� �Է��ϼ���(�� : 0) : ");
			month = stdin.nextInt();
			if (3 <= month && month <= 5 )
				System.out.println("�� �Դϴ�");
			else if (6 <= month && month <= 8 )
				System.out.println("���� �Դϴ�");
			else if (9 <= month && month <= 11 )
				System.out.println("���� �Դϴ�");
			else if (1 == month || month == 2 || month == 12 )
				System.out.println("�ܿ� �Դϴ�");
			else if (month != 0)
				System.out.println("�߸��� �Է� : �ش�Ǵ� ������ �����ϴ�");
		} while ( month != 0 );	
		System.out.println("�����մϴ�");
	}	
}