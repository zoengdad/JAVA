class Box10 {
	public int width;
	public int height;
	public int depth;
	public Box10(int w,int h,int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class ObjectMethodTest3 {
	public static void main(String args[]) {
		int a1=10, a2=10;
		Box10 b1 = new Box10(10,20,30);
		Box10 b2 = new Box10(10,20,30);
		Box10 b3 = b2;
        System.out.println(a1==a2 ? "a1�� a2�� ����" :"a1�� a2�� ���� �ʴ�" );
        System.out.println(b1==b2 ? "b1�� b2�� ����" :"b1�� b2�� ���� �ʴ�" );
        System.out.println(b2==b3 ? "b2�� b3�� ����" :"b2�� b3�� ���� �ʴ�" );
	}
}
