public class IntegerTest1 {
	public static void main(String args[]) {
		Integer num1 = new Integer(13);
		Integer num2 = 25;
		num2 = num1 + num2;
		System.out.println("num1�� �����ϰ� �ִ� ������ : " + num1.intValue());
		System.out.println("num2�� �����ϰ� �ִ� ������ : " + num2);
		System.out.println("�μ��� ��  = " + num2);
		System.out.println("���� 2�� ǥ�� : " + Integer.toBinaryString(num2));
		System.out.println("���� 8�� ǥ�� : " + Integer.toOctalString(num2));
		System.out.println("���� 16�� ǥ�� : " + Integer.toHexString(num2));   
		System.out.println("if(num1 == num2) �� : " + num1.equals(num2));
		Integer num3 = new Integer("444");  
		System.out.println("���ڿ� '444'�� ���� : " + num3.intValue()); 
		System.out.println("2���� '1001001'�� 10�� ���� : " + Integer.parseInt("1001001", 2)); 
	}
}
