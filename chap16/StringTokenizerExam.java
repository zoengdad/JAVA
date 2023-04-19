import java.util.*;

class StringTokenizerExam {
	public static void main(String args[]) {
		String s1 = "���� ���ѹα� ���� ȫ�浿 ���� �� �ּ� �����";
		String s2 = "����,���ѹα�,����,ȫ�浿,����,��,�ּ�,�����";
		StringTokenizer st1 = new StringTokenizer(s1);
		while(st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		System.out.println("=================");
		StringTokenizer st2 = new StringTokenizer(s2,",");
		while(st2.hasMoreTokens()) {
			String first = st2.nextToken();
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}
		System.out.println("=================");
		st2 = new StringTokenizer(s2);
		while(st2.hasMoreTokens()) {
			String first = st2.nextToken(",");
			String second = st2.nextToken(",");
			System.out.println(first + "\t" + second);
		}
	}
}
