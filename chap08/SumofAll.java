import java.util.Scanner;
public class SumofAll {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ ������ �� ���� ���ڸ� �Է�(���� ������ �������� ����) : ");
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		Sum s = new Sum();
		System.out.println(n + "���� " + m + "������ �� : " + s.allsum(n, m));
	}
}
