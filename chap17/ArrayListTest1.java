import java.util.*;
class ArrayListTest1 {
	public static void main(String[] args) {
		String[] name = {"kim","lee","park","jung","oh"};
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("�ʱ� �� : "+lname);
		lname.add("ha");
		System.out.println("\"ha\" �߰��� ���� �� : "+lname);
		lname.set(0,"��");
		lname.add(3,"��");
		System.out.println("\"��\"���� ����ǰ� \"��\"�� �߰��� �� : "+lname);
		Collections.shuffle(lname);
		System.out.println("shuffle() �޼ҵ尡 ����� �� : "+lname);
		Collections.sort(lname);
		System.out.println("sort() �޼ҵ尡 ����� �� : "+lname);
		System.out.println("5��° ����� �� : "+lname.get(4));
		Collections.fill(lname, "��");
		System.out.println("��� ��Ҹ� \"��\"���� ������ �� : "+lname);	
	}
}
