public class SwitchTest3 {
	public static void main(String args[]) 
	{
		char c = 'A';
		//char c = 'a';
		switch (c)
		{
			case 'A':
			case 'B':
				System.out.print("����� �����Դϴ�");
				break;
			case 'C':
			case 'D':
				System.out.print("�й��Ͻʽÿ�");
				break;
			case 'F':
				System.out.print("���� ����� �ʿ��մϴ�");
				break;
			default:
				System.out.print("��Ȯ�� ������ �ƴմϴ�");
		}
	}
}