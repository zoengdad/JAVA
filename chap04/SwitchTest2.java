import java.util.Scanner;
public class SwitchTest2 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(������) : ");
		String month = stdin.next();
		String MtoS;
		switch (month)
		{
			case "December":
			case "January":
			case "February":
				MtoS = "�ܿ��Դϴ�.";
				break;
			case "March":
			case "April":
			case "May":
				MtoS = "���Դϴ�.";
				break;
			case "June":
			case "July":
			case "August":
				MtoS = "�����Դϴ�.";
				break;
			case "September":
				System.out.print("���� 9���� ");
			case "October":
				System.out.print("�Ƹ��ٿ� 10���� ");
			case "November":
				System.out.print("������ 11���� ");
				MtoS = "�����Դϴ�.";
				break;
			default:
				MtoS = "1~12���� ��� ���Դϴ�.";
				break;
		}
		System.out.println(MtoS);
	}
}