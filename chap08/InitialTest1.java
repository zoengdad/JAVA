class Initial{
	int number;
	double rate;
	String name;
	int[] score;
	public void aMethod() {
		int count;
		System.out.println(number);
		//System.out.println(count);
	}
}
public class InitialTest1 {
	public static void main(String args[]) {
		int var1;
		double var2;
		Initial ob1 = new Initial();
		//System.out.println("���� ���� var1�� ���� : " + var1);
		//System.out.println("���� ���� var2�� ���� : " + var2);
		System.out.println("��ü ���� number�� ���� : " + ob1.number);
		System.out.println("��ü ���� rate�� ���� : " + ob1.rate);
		System.out.println("��ü ���� name�� ���� : " + ob1.name);
		System.out.println("��ü ���� score�� ���� : " + ob1.score);
		ob1.aMethod();
	}
}