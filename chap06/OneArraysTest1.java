import java.util.Scanner;
public class OneArraysTest1 {
	public static void main(String args[]) 
	{
		int inum[] = {8,7,3,6,9,6,8,7,0,4,1,2};
		Scanner stdin = new Scanner(System.in);
		System.out.print("ã�� ���� ���� �Է� : ");
		int key = stdin.nextInt();
		int count = 0;
		for (int i = 0 ; i < inum.length ; i++) 
		{
			if ( inum[i] == key ) {
				count++;
				System.out.println((i+1) + "��° �����Ϳ� ��ġ");
			}
		}
		if (count == 0)
			System.out.println(key + "���� �迭�� �����ϴ�");
		else
			System.out.println(key+ "���� �迭�� "+count+"�� �ֽ��ϴ�");
	}
}
