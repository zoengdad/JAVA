import java.io.*;
import java.util.Scanner;
public class FileWriterTest1 {
	public static void main(String args[]) throws Exception {
		Scanner stdin = new Scanner(System.in);
		String source = "��� �־�� ��μ� ���������� ���\n" + "������ ����Ѵٴ� ����\n" + "����� �������� ��ħ�� �´´ٴ� ���Դϴ�.\n";
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileWriter fw = new FileWriter(s);
		fw.write(source);
		fw.close();
		System.out.print(s + "������ �����Ǿ����ϴ�");
	}
}