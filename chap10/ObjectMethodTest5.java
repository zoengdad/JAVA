class Box12 {
	public int width;
	public int height;
	public int depth;
	public Box12(int w,int h,int d) {
		width = w;
		height = h;
		depth = d;
	}
	public boolean equals(Box12 box12) {
		return (this.width == box12.width && this.height == box12.height && this.depth == box12.depth);
	}
}
public class ObjectMethodTest5 {
	public static void main(String args[]) {
		Box12 b1 = new Box12(10,20,30);
		Box12 b2 = new Box12(10,20,30);
		Box12 b3 = b2;
		System.out.println(b1.equals(b2) ? "b1�� b2�� �������� ����" :"b1�� b2�� �������� ���� �ʴ�" );
	    System.out.println(b1 == b2 ? "b1�� b2�� ���������� ����" :"b1�� b2�� ���������� ���� �ʴ�" );
	    System.out.println(b2.equals(b3) ? "b2�� b3�� �������� ����" :"b2�� b3�� �������� ���� �ʴ�" );
        System.out.println(b2 == b3 ? "b2�� b3�� ���������� ����" :"b2�� b3�� ���������� ���� �ʴ�" );
	}	
}
