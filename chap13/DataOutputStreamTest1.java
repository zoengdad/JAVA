import java.io.*;
import java.util.Scanner;
public class DataOutputStreamTest1 {
	public static void main(String args[]) throws IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("����� ���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileOutputStream fos = new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('��');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MIN_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		fos.close();
		System.out.print(s + "������ �����Ǿ����ϴ�");
	}
}