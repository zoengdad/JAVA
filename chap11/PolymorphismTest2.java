class Item {
	public int price;
}
class Noodle extends Item {
	public Noodle() {
		price = 2500;
	}
	public String toString() { return "����";}
}
class Mixnoodle extends Item {
	public Mixnoodle() {
		price = 3000;
	}
	public String toString() { return "��� ����";}
}
class Wodong extends Item {
	public Wodong() {
		price = 2500;
	}
	public String toString() { return "�쵿";}
}
class Byer {
	private int money;
	public Byer(int money) {
		this.money = money;
	}
	public void buy(Item it, int count) {
		System.out.println(it +"��(��) " + count +"�� ���ְ� �Ծ����ϴ�");
		money = money - it.price*count;
		System.out.println("���� ���� �� : "+ money);
	}	
}

public class PolymorphismTest2 {
	public static void main(String args[]) {
		Byer me = new Byer(20000);
		me.buy(new Wodong(),3);
		me.buy(new Noodle(),2);
		me.buy(new Mixnoodle(),2);
	}
}