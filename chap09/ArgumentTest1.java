class Argument {
	public void change(int i, int j[]) {
		i = 20;
		j[3] = 400;
	}
	public void display(int i, int j[]) {
		System.out.println("��ü ���� i�� �� : " + i);
		System.out.print("�迭�� �� : ");
		for(int value : j)
			System.out.print(value + " ");
		System.out.println();
	}
}
class ArgumentTest1 {
	public static void main(String args[]) {
		Argument d = new Argument();
		int a = 10;
		int b[]  = { 1, 2, 3, 4 };
		System.out.println("ù ��° display() �޼ҵ� ȣ��");
		d.display(a, b);
		d.change(a, b);
		System.out.println("=============================");
		System.out.println("���� ��ȯ�� ���� �� ��° display() ȣ��");
		d.display(a, b);
	}
}