import java.util.*;

class HashMapTest2{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		System.out.print("����, ����, �� ���� ����(1:����, 2:����, 3:��) : ");
		int user = p.nextInt()-1;
		Random random = new Random();
		int com = random.nextInt(3);
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "����");
		hm.put(1, "����");
		hm.put(2, "��");
		Object value1 = hm.get(user);
		System.out.println("����� " + value1 + "�� �½��ϴ�");
		Object value2 = hm.get(com);
		System.out.println("��ǻ�ʹ� " + value2 + "�� �½��ϴ�");
		System.out.println("=================================");
		System.out.print("���� ��� : ");
		if(user == com)
			System.out.println("�����ϴ�");
		else if(user == (com+1) % 3)
			System.out.println("����� �̰���ϴ�");
		else
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
	}
}