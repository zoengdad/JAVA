import java.io.*;
import java.util.Scanner;
public class FileOutputStreamTest1 {
	public static void main(String args[]) throws IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("��� ���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileOutputStream fos = new FileOutputStream(s);
		for(int i = 1; i <= 260 ; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println(s+ " ���ϸ����� ����Ʈ ������ �����Ͽ����ϴ�.");
	}
}