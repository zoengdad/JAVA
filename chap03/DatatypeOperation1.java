import java.util.Scanner;
public class DatatypeOperation1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է� : ");
		int first = stdin.nextInt();
		System.out.print("�� ��° ������ �Է� : ");
		int  second = stdin.nextInt();
		double avg1 = (first+second) / 2 ;
		System.out.println("���� ���� : �����("+first+"+"+second+")/2 = "+avg1+" �Դϴ�");
		double avg2 = (first+second) / 2.0 ;
		System.out.println("�Ǽ� ���� : �����("+first+"+"+second+")/2.0 = "+avg2+" �Դϴ�");
	}
}
