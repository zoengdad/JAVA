abstract class Figure {
	abstract void draw();
}
class Triangle extends Figure {
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}
class Rectangle extends Figure {
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}
class Oval extends Figure {
	public void draw() {
		System.out.println("Ÿ������ �׸���");
	}
}
public class AbstractTest1 {
	public static void main(String args[]) {
		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Oval();
		fg1.draw();
		fg2.draw();
		fg3.draw();		
	}
}	