public class StringBufferTest1 {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("ó�� �����ϴ� �ڹ�");
		System.out.println("���ڿ� => " + sb1);
		System.out.println("���ڿ� ���� => " + sb1.length());
		System.out.println("���۸� ������ ���� => " + sb1.capacity());
	    System.out.println("���ۿ� ����ִ� ���� => " + sb2);
	    System.out.println("���ڿ� �����ֱ� => " + sb2.insert(8,"Power "));
	    System.out.println("������ 8��° ���� => " + sb2.charAt(8));
	    sb2.setCharAt(5, '��');
	    System.out.println("5��° ���� '��'�� ���� => " + sb2);
	    sb2.setLength(5);
	    System.out.println("������ ���ο� �� => " + sb2);
	    System.out.println("���ڿ��� ��������ϱ� => " + sb2.reverse());
	}
}