import java.util.Scanner;
class Engine {
	String capacity;
	String fuel;
	private int price = 20000000; 
	public Engine(int cc, int fuel) {
		if (cc == 1) {
			capacity = "2000cc����";
			price += 0;
		}
		else {
			capacity = "2000cc�̻�";
			price += 10000000;
		}
		if (fuel ==1) {
			this.fuel = "���ָ�";
			price += 5000000;
		}
		else
			this.fuel = "����";
	}
	public int getPrice() {
		return price;
	}
}
class Car {
	String color;
	Engine e;
	public Car(String c, int cc, int fuel) {
		color = c;
		e = new Engine(cc,fuel);
	}
	public String getPrice() {
		return "����� ��û�� " + e.capacity + "�� " + e.fuel + "����(�÷�:"+color+")�� ������ : "+ e.getPrice();
	}
	
}

public class CarTest {
	public static void main(String args[]) {
		String color;
		int cc, fuel;		
		System.out.print("�����ϰ� ���� ���� ��ⷮ�� (1:2000cc���� 2:2000cc�̻�) : ");
		Scanner stdin = new Scanner(System.in);
		cc = stdin.nextInt();
		System.out.print("�����ϰ� ���� ���� ����� (1:���ָ� 2:����) : ");
		stdin = new Scanner(System.in);
		fuel = stdin.nextInt();
		System.out.print("�����ϰ� ���� �÷��� : ");
		stdin = new Scanner(System.in);
		color = stdin.next();
		Car c = new Car(color, cc, fuel);
		System.out.println(c.getPrice());
		System.out.println("������ ������ : " + c.e.getPrice());
	}
}