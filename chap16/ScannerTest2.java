import java.util.Scanner;
import java.io.File;

public class ScannerTest2 {
	public static void main(String[] args) throws Exception{
		Scanner p = new Scanner(System.in);
		System.out.print("�˻��� ���ϴ� �л��� �й��� �Է��ϼ��� : ");
		int id = p.nextInt(); 
		Scanner s = new Scanner(new File("phone.txt"));
		while (s.hasNext()) {
			if (id == s.nextInt()) { 
				System.out.println(id+"�л��� ��ȭ��ȣ : " + s.next());
				return;
			}
			else
				s.next();			
		}
		System.out.println("�л��� ��ȣ�� ����Ǿ� ���� �ʽ��ϴ�");
	}
}
