import java.util.Arrays;
public class ArraysCMethodTest2 {
	public static void main(String args[]) {
		String[] array1 = {"IMF", "���ֵ�", "�ڹٵ���", "�ѱ۳���", "Computer", "��ī", "JAVA", "���ͳ�Ž��", "�ʷ��ʷ�", "come", "�ٶ�", "��ũ����", "������", "����", "their","country" };   
		System.out.println("======= ���� �� ������ ==========");
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("======= ���� �� ������ ==========");
		System.out.println(Arrays.toString(array1));
		System.out.println("�������� �迭�� " + Arrays.binarySearch(array1,"������") + "��° ���");
		String[] array2 = array1;
		System.out.println("array1�� array2�� ������? : " +Arrays.equals(array1,array2));
		String[] array3 = new String[20];
		System.arraycopy(array2, 0, array3, 0, array2.length);
		System.out.println("array3 �迭 : " + Arrays.toString(array3));
	}
}