class Box7 {
	int width;
	int height;
	int depth;
	public Box7()
	{
		this(1,1,1);
		System.out.println("�Ű� ���� ���� ������ ����");
	}
	public Box7(int width)
	{
		this(width,1,1);
		System.out.println("�Ű� ����(1��) ������ ����");
	}
	public Box7(int width, int height)
	{
		this(width,height,1);
		System.out.println("�Ű� ����(2��) ������ ����");
	}
	public Box7(int width, int height, int depth)
	{
		System.out.println("�Ű� ����(3��) ������ ����");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class Box7Test1 {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� ����) : " + vol);
		mybox1 = new Box7(10);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 1��) : " + vol);
		mybox1 = new Box7(10,20);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 2��) : " + vol);
		mybox1 = new Box7(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 3��) : " + vol);
	}
}