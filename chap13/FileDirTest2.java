import java.io.File;
public class FileDirTest2 {
	public static void main(String args[]) {
		File f1 = new File("C:/a.txt");
		System.out.println("���� �̸� : " + f1.getName());
		System.out.println("���� ��� : " + f1.getPath());
		System.out.println("���� ��� : " + f1.getAbsolutePath());
		System.out.println(f1.exists() ? "���� ����" : "���� ����");
		System.out.println(f1.canWrite() ? "���� ����" : "���� �Ұ���");
		System.out.println(f1.canRead() ? "�б� ����" : "�б� �Ұ���");
		System.out.println(f1.isDirectory() ? "���丮" : "���丮 �ƴ�");
		System.out.println(f1.isFile() ? "����" : "���� �ƴ�");
		System.out.println(f1.isAbsolute() ? "���� ���" : "��� ���");
		System.out.println("1970�� 1�� 1�Ϻ��� ������ ������ ������ ��¥������ �и��� : " + f1.lastModified());
		System.out.println("������ ũ�� : " + f1.length() + " Bytes");
	}
}