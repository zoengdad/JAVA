import java.util.*;
class HashMapTest1 {	
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("����","���ѱ�");
		hm.put("����","21");
		Object x = hm.put("����","���ѹα�");
		if (x != null) 
			System.out.println("��ü�� �� : " + x);
		else
			System.out.println("�ʿ� �߰�");
		System.out.println(hm);
		Object y = hm.put("����","24");
		if (y != null)
			System.out.println("��ü�� �� : "+ x);
		System.out.println(hm);
		Object z = hm.remove("����");
		if (z != null) 
			System.out.println("������ �� : "+ z);
		else 
			System.out.println("Ű�� �������� ����");
		System.out.println(hm);
	}
}
