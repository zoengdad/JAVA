class OIa {
	public void show(String str) {
		System.out.println("���� Ŭ������ �޼ҵ� show(String str)���� " + str);
	}
}
class OIb extends OIa {
	public void show() {
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
	}
}
public class OverridingTest1 {
	public static void main(String args[]) {
		OIb oib = new OIb();
		oib.show("ó�� �����ϴ� �ڹ�"); 
	    oib.show();
	}
}
