class DB1 {
	public double d1;
	public DB1() {  
		System.out.println("Ŭ���� DB1�� ������ ������ ����");
		d1 = 10*10;
	}
}
class DB2 extends DB1 {
	public double d2;
	public DB2() {
		System.out.println("Ŭ���� DB2�� ������ ������ ����");
		d2 = 10*10*10;
	}
	public DB2(double d ) {	
		System.out.println("Ŭ���� DB2�� ����� ������ ����");
		d2 = d*d*d;
	}
}
class DB3 extends DB2 {
	public double d3;
	public DB3() {
		System.out.println("Ŭ���� DB3�� ������ ������ ����");
		d3 = 10*10*10*10;
	}
	public DB3(double d ) {
		System.out.println("Ŭ���� DB3�� �����(�Ű�����1��) ������ ����");
		d3 = d*d*d*d;
	}
}
public class DefaultInheritanceTest2 {
	  public static void main(String args[]) {
		  DB3 super1 = new DB3(11);
		  System.out.println("10�� 2���� : " + super1.d1);
		  System.out.println("10�� 3���� : " + super1.d2);
		  System.out.println("10�� 4���� : " + super1.d3);
	  }
}