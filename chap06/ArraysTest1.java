import java.util.Scanner;
public class ArraysTest1 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum=0.0, avg;;
		double dnum[] = new double[5];
		System.out.println("dnum �迭�� ���� : " + dnum.length);
		System.out.print("�ʱ�ȭ ���� ���� dnum[]�� ��: ");
		for (i=0; i < dnum.length ; i++)
			System.out.print(dnum[i]+" ");
		System.out.println();
		
		for (i=0; i < dnum.length ; i++){
			System.out.print("dnum["+(i)+"] ��° ������ �Է� : ");
			dnum[i] = stdin.nextDouble();
		}	
		for (i=0; i < dnum.length ; i++)
			sum = sum + dnum[i];
		System.out.println("�迭�� ���� " + sum + "�Դϴ�");
		avg = sum/dnum.length; 
		System.out.println("�迭 ���� �����  " + avg + "�Դϴ�");
			
	}
}