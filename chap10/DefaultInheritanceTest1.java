class DA1 {
	public double d1;
	public DA1() {  // Ŭ���� A1�� ������ ������
		System.out.println("Ŭ���� DA1�� ������ ������ ����");
		d1 = 10*10;
	}
}
class DA2 extends DA1 {
	public double d2;
	public DA2() {
		System.out.println("Ŭ���� DA2�� ������ ������ ����");
		d2 = 10*10*10;
	}
}
class DA3 extends DA2 {
	public double d3;
	public DA3() {	
		System.out.println("Ŭ���� DA3�� ������ ������ ����");
		d3 = 10*10*10*10;
	}
}
public class DefaultInheritanceTest1 {
	  public static void main(String args[]) {
		  DA3 super1 = new DA3();
		  System.out.println("10�� 2���� : " + super1.d1);
		  System.out.println("10�� 3���� : " + super1.d2);
		  System.out.println("10�� 4���� : " + super1.d3);
		  DA2 super2 = new DA2();  
	  }
}