import java.util.Scanner;
public class BreakTest1 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("�հ踦 ���ϴ� ���� �Է� : ");
		int num = stdin.nextInt();
		int sum = 0, i = 1;
		while (true) {
			sum = sum + i;
			if (i == num) break;
			i++;
		}
		System.out.println(num+"������ �հ�� = "+ sum);
	}
}