class Box11 {
	public int width;
	public int height;
	public int depth;
	public Box11(int w,int h,int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class ObjectMethodTest4 {
	public static void main(String args[]) {
		Box11 b1 = new Box11(10,20,30);
		Box11 b2 = new Box11(10,20,30);
		Box11 b3 = b2;
        System.out.println(b1.equals(b2) ? "b1�� b2�� ����" :"b1�� b2�� ���� �ʴ�" );
        System.out.println(b2.equals(b3) ? "b2�� b3�� ����" :"b2�� b3�� ���� �ʴ�" );
        String s1 = new String("ó�� �����ϴ� �ڹ�");
        String s2 = new String("ó�� �����ϴ� �ڹ�");
        System.out.println(s1.equals(s2) ? "s1�� s2�� ����" :"s1�� s2�� ���� �ʴ�" );
	}
}
