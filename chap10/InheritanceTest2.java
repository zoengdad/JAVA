class B1 {
	public int x = 500;
	public int y = 1000;
}
class B2 extends B1 {
	public String x = "ó�� �����ϴ� �ڹ�";
}
public class InheritanceTest2 {
	public static void main(String args[]) {
		B2 b2 = new B2();
		System.out.println("��ü b2�� ��� �ִ� x,y �� : " + b2.x + b2.y);
		B1 b1 = new B1();
		System.out.println("��ü b1�� ��� �ִ� x,y �� : " + b1.x + b1.y);
	}
}
