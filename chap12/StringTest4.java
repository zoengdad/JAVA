public class StringTest4 {
	static String array1[] = {"IMF", "���ֵ�", "�ڹٵ���", "�ѱ۳���",
		"Computer",	"��ī", "JAVA", "���ͳ�Ž��", "�ʷ��ʷ�", "come",
		"�ٶ�", "��ũ����", "������","����", "their",	"country" }; 
	public static void main(String args[]) {
		System.out.println("======= ���� �� ������ ==========");
		for(String s : array1)
			System.out.print(s + "  ");
		System.out.println();
		System.out.println("======= ���� �� ������ ==========");
		for(int i = 0; i < array1.length; i++) {
			for(int j = i + 1; j < array1.length; j++) {
				if(array1[i].compareTo(array1[j]) > 0) {
					String t = array1[i];
					array1[i] = array1[j];
					array1[j] = t;
				}
			}
			System.out.print(array1[i] + "  ");
		}
	}
}