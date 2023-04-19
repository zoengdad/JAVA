abstract class Figure1 {
	abstract void draw();
}
interface Shape1 {
	public void computeArea(double a, double b);
}
class Triangle3 extends Figure1 implements Shape1 {
	void draw() {
		System.out.println("�ﰢ���� �׸��� ���");
	}
	public void computeArea(double a, double h) {
		System.out.println("�ﰢ���� ���� : " + (a * h / 2));
	}
}
class Rectangle3 extends Figure1 implements Shape1 {
	void draw() {
		System.out.println("�簢���� �׸��� ���");
	}
	public void computeArea(double h, double v) {
		System.out.println("�簢���� ���� : " + (h * v));
	}
}
class Oval3 extends Figure1 implements Shape1 {
	void draw() {
		System.out.println("���� �׸��� ���");
	}
	public void computeArea(double r1, double r2) {
		System.out.println("���� ���� : " + (3.14 * r1 * r2));
	}
}
class Polydraw1 {
	public void pdraw(Figure1 f) {
		f.draw();
	}
	public void pcomputeArea(Shape1 s,double a, double b) {
		s.computeArea(a,b);
	}
}
public class InterfaceTest2 {
	public static void main(String args[]) {
		Polydraw1 p = new Polydraw1();
		Figure1 fg1 = new Triangle3();
		Figure1 fg2 = new Rectangle3();
		Figure1 fg3 = new Oval3();
		Shape1 sp1 = new Triangle3();
		Shape1 sp2 = new Rectangle3();
		Shape1 sp3 = new Oval3();
		p.pdraw(fg1);
		p.pcomputeArea(sp1,4,4);
		p.pdraw(fg2);
		p.pcomputeArea(sp2,4,4);
		p.pdraw(fg3);
		p.pcomputeArea(sp3,4,4);
	}
}
