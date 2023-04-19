import java.util.*;

class StackTest1 {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		System.out.println("���ÿ� push : " + stack.push("��⵵"));
		System.out.println("���ÿ� push : " + stack.push("��û��"));
		System.out.println("���ÿ� push : " + stack.push("������"));
		System.out.println("���ÿ� push : " + stack.push("����"));
		System.out.println("���ÿ� push : " + stack.push("���"));
		System.out.println("���ÿ� push : " + stack.push("���ֵ�"));
		System.out.println("=============================");
		int n = stack.search("���ֵ�");
		if (n != -1)
			System.out.println("���ÿ��� ���� \"���ֵ�\"�� ��ġ�� : "+n+"��° �Դϴ�");
		else
			System.out.println("���ÿ��� ���� \"���ֵ�\"�� �����ϴ�");
		System.out.println("=============================");
		while(!stack.empty()) {
			String obj = stack.pop();
			System.out.println("���ÿ��� pop : " + obj);
		}
	}
}

