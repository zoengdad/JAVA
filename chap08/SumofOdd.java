import java.util.Scanner;
public class SumofOdd {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Ȧ�� ������ ������ �� ���� ���ڸ� �Է�(���� ������ �������� ����) : ");
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		Sum s = new Sum();
		System.out.println(n + "���� " + m + "������ Ȧ���� �� : " + s.oddsum(n, m));
	}
}
