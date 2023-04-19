abstract class Shape {
	abstract void draw();
	abstract void computeArea(double a, double b);
}
class Rectangle1 extends Shape {
	void draw() {
		System.out.println("�簢���� �׸��� ���");
	}
	void computeArea(double h, double v) {
		System.out.println("�簢���� ���� : " + (h * v));
	}
}
class Triangle1 extends Shape {
	void draw() {
		System.out.println("�ﰢ���� �׸��� ���");
	}
	void computeArea(double a, double h) {
		System.out.println("�ﰢ���� ���� : " + (a * h / 2));
	}
}

public class AbstractTest1 {
	public static void main(String args[]) {
		System.out.println("==�߻� �޼ҵ带 �̿��� ������==");
		Shape s = new Rectangle1();
		s.draw();  
		s.computeArea(5.0, 10.0);
		s = new Triangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
	}
}