class D1 {
	int x = 1000;
	void display() {
		System.out.println("상위 클래스 D1의 display() 메소드입니다");
	}
}
class D2 extends D1 {
	int x = 2000;
	void display() {
		System.out.println("하위 클래스 D2의 display() 메소드입니다");
	}
	void write() {
		display();
		super.display();
		System.out.println("D2 클래스 객체의 x 값은 : " + x);
		System.out.println("D1 클래스 객체의 x 값은 : " + super.x);
	}
}

class SuperTest2 {
	public static void main(String args[]) {
		D2 d = new D2();
		d.write();
	}
}

