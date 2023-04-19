import java.io.*;
class Box implements Serializable {
	public int width;
	public int height;
	public int depth;
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class ObjectWriteTest1 {
	public static void main(String args[]) throws Exception {
		String s1 = "***�ڽ��� ����,����,����***";
		Box mybox1 = new Box(10,20,30);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.txt"));
		oos.writeObject(s1);
		oos.writeObject(mybox1);
		oos.writeDouble(123.456);
		oos.close();
		System.out.println("tmp.txt ȭ�ϸ����� ��ü ������ �����Ͽ����ϴ�.");
	}
}