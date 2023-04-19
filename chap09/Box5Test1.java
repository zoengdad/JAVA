class Box5 {
	int width;
	int height;
	int depth;
	public Box5()
	{
		width = 1;
		height = 1;
		depth = 1;
	}
	public Box5(int w)
	{
		width = w;
		height = 1;
		depth = 1;
	}
	public Box5(int w, int h)
	{
		width = w;
		height = h;
		depth = 1;
	}
	public Box5(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
}
public class Box5Test1 {
	public static void main(String args[]) {
		Box5 mybox1 = new Box5();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� ����) : " + vol);
		mybox1 = new Box5(10);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 1��) : " + vol);
		mybox1 = new Box5(10,20);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 2��) : " + vol);
		mybox1 = new Box5(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 3��) : " + vol);
	}
}