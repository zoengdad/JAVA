class Box1 {
	int width;
	int height;
	int depth;
}
public class Box1Test1 {
	public static void main(String args[]) {
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		int vol1, vol2;

		mybox1.width = 78;
		mybox1.height = 145;
		mybox1.depth = 87;

		mybox2.width = 48;
		mybox2.height = 45;
		mybox2.depth = 137;

		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("ù ��° �ڽ��� ���Ǵ� " + vol1 + "�Դϴ�");

		vol2 = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("�� ��° �ڽ��� ���Ǵ� " + vol2 + "�Դϴ�");
  }
}