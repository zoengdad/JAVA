import java.util.*;

class TreeMapTest1 {
	public static void main(String args[]) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(88,"����");
		tm.put(100,"����");
		tm.put(76,"����");
		tm.put(80,"��ȸ");
		tm.put(69,"����");
		
		Map.Entry<Integer,String> me = tm.firstEntry();
		System.out.println("���� ���� ������ " + me.getKey() + "���̸� ������ "+ me.getValue() + "�Դϴ�");
		me = tm.lastEntry();
		System.out.println("���� ���� ������ " + me.getKey() + "���̸� ������ "+ me.getValue() + "�Դϴ�");
		Map<Integer,String> cd = tm.headMap(80);
		System.out.println("���� C,D�� �ش��ϴ� ����� ���� : " + cd);
		Map<Integer,String> ab = tm.tailMap(80);
		System.out.println("���� A,B�� �ش��ϴ� ����� ���� : " + ab);
		System.out.println("���� ������ ���(���� ���� ����) : " + tm);
		System.out.println("���� ������ ���(���� ���� ����) : " + tm.descendingMap());
	}
}