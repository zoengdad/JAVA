public class StringTest3 {
	public static void main(String args[]) {
	    String s1 = "WorldCup Korea";
	    System.out.println("����� ���� : " + s1.charAt(2));
	    String s2 = "Apple";
	    String s3 = "APPLE";
	    System.out.println("s2�� s3�� ������ ���ڿ�?(��ҹ��� ����) : " + s2.equalsIgnoreCase(s3));
	    System.out.println("s1���ڿ��� \"World\"�� �����ϴ°�? " + s1.startsWith("World"));
	    System.out.println("s1���ڿ��� \"rea\"�� �����°�? " + s1.endsWith("rea"));
	    String s4 = "ó�� �����ϴ� �ڹ�";
	    System.out.println("�ε��� 5���� 7���������� ���ڿ� : " + s4.substring(5,7));
	    System.out.println(s4.concat("�� ���� ���α׷�"));
	    System.out.println(s4.replace('��','��'));
	}
}