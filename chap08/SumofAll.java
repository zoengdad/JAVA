import java.util.Scanner;
public class SumofAll {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("덧셈을 수행할 두 개의 숫자를 입력(작은 수부터 공간으로 구분) : ");
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		Sum s = new Sum();
		System.out.println(n + "부터 " + m + "까지의 합 : " + s.allsum(n, m));
	}
}
