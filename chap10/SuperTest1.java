class SB1 {
	public int x = 500;
	public int y = 1000;
}
class SB2 extends SB1 {
	public String x = "ó�� �����ϴ� �ڹ�";
	public String xx = x + super.x;
	public String yy = ""+ y + super.y;
}
public class SuperTest1 {
	public static void main(String args[]) {
		SB2 sb2 = new SB2();
		System.out.println("��ü sb2�� ��� �ִ� x,y �� : " + sb2.x + sb2.y);
		//sb2.super.x �̿� ���� ����� ��� �� ��
		System.out.println("��ü sb2�� ��� �ִ� xx �� : " + sb2.xx);
		System.out.println("��ü sb2�� ��� �ִ� yy �� : " + sb2.yy);
	}
}

