class Box10 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	private static long boxID = 0;  
	public Box10(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		volume();
	}
	private void volume()
	{
		vol = width * height * depth;		
	}
	public String getvolume() {
		return idNum +"�� �ڽ��� ���� : "+ vol;
	}
	public static long getCurrentID() {
		// return idNum;
		return boxID;
	}
}
public class Box10Test1 {
	public static void main(String args[]) {
		Box10 mybox1;
		for(int i=1 ; i <= 5 ; i++) {
			mybox1 = new Box10(i,i+1,i+2);
			System.out.println(mybox1.getvolume());
		}
		System.out.println("������ ������ �ڽ� ��ȣ�� "+ Box10.getCurrentID() + "���Դϴ�");
		// System.out.println(Box10.boxID);
	}
}