class OIaa {
	public void show(String str) {
		System.out.println("���� Ŭ������ �޼ҵ� ���� : " + str);
	}
}
class OIbb extends OIaa {
	public void show(String s) {
		System.out.println("���� Ŭ������ �޼ҵ� show() ���� : " + s);
	}
}
public class OverridingTest2 {
	public static void main(String args[]) {
		OIbb oibb = new OIbb();
		oibb.show("���� �ڹ����α׷���!!!"); 
	}
}