import java.io.*;
import java.util.Scanner;
class FileReaderTest1 {
	public static void main(String args[]) throws Exception {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�о� ���� ���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileReader fr = new FileReader(s);
		int i;
		while((i = fr.read()) != -1 ) {
			System.out.print((char)i);
		}
		fr.close();
	}
}