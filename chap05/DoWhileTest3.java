import java.util.Scanner;
public class DoWhileTest3 {
	public static void main(String args[]) {
		int choice;
		Scanner stdin = new Scanner(System.in);
		do {
			System.out.println("==== �ݺ��� ���� ���� ====");
			System.out.println("  1. while �ݺ���");
			System.out.println("  2. do-while �ݺ���");
			System.out.println("  3. for �ݺ���");
			System.out.println("�����÷��� 99�� �Է��ϼ���");
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
			choice = stdin.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("****while �ݺ���****");
		    	System.out.println("������ ���� �˻��ϰ� ������ ���� ��� �ݺ� �κ��� �����ϴ� �ݺ���");
		    	break;
		    case 2 :
		    	System.out.println("****do-while �ݺ���****");
		    	System.out.println("�ݺ� �κ��� ���� �����ϰ� ������ �˻��Ѵ�. �ּ��� �� ���� ����Ǵ� �ݺ���");
		    	break;
		    case 3 :
		    	System.out.println("****for �ݺ���****");
		    	System.out.println("������ Ƚ����ŭ �ݺ� �κ��� �����ϴ� �ݺ���");
		    	break;	
		    case 99 :
		        System.out.println("����� �ּż� �����մϴ�");
                break;		     
		    default :
		    	System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�");
		    }
			System.out.println();
		} while( choice != 99 );
	}
}