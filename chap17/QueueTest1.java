import java.util.*;

class QueueTest1 {
	public static void main(String args[]) {
		LinkedList<String> queue = new LinkedList<String>();
		System.out.println("ť�� ��⵵ offer : " + queue.offer("��⵵"));
		System.out.println("ť�� ��û�� offer : " + queue.offer("��û��"));
		System.out.println("ť�� ������ offer : " + queue.offer("������"));
		System.out.println("ť�� ���� offer : " + queue.offer("����"));
		System.out.println("ť�� ��� offer : " + queue.offer("���"));
		System.out.println("ť�� ���ֵ� offer : " + queue.offer("���ֵ�"));

		System.out.println("=============================");
		int n = queue.indexOf("���ֵ�");
		if (n != -1)
			System.out.println("ť���� ���� \"���ֵ�\"�� ��ġ�� : "+(n+1)+"��° �Դϴ�");
		else
			System.out.println("ť���� ���� \"���ֵ�\"�� �����ϴ�");
		System.out.println("=============================");
		while(!queue.isEmpty()) {
			String obj = queue.poll();
			System.out.println("ť���� poll : " + obj);
		}
	}
}
