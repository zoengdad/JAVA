class Rectangle {
	public int width;
	public int height;
	public Rectangle(int w, int h) {
		width = w;
		height = h;		
	}
	public int computeRectangleArea() {
		return width * height;
	}
}
class Cube extends Rectangle {
	public int depth;
	public Cube(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	public int computeCubeArea() {
		return super.computeRectangleArea() * depth;
	}
}
public class InstanceTest1 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10,20);
		Cube c = new Cube(10,20,30);
		System.out.println("r�� Rectangle�� ��ü? : "+ (r instanceof Rectangle));
		System.out.println("r�� Cube�� ��ü? : "+ (r instanceof Cube));
		System.out.println("c�� Rectangle�� ��ü? : "+ (c instanceof Rectangle));
		System.out.println("c�� Cube�� ��ü? : "+ (c instanceof Cube));
		System.out.println("=========�� ��ȯ ����===========");
		r = new Cube(20,30,40);
		System.out.println("�� ��ȯ r�� Rectangle�� ��ü? : "+ (r instanceof Rectangle));
		System.out.println("�� ��ȯ r�� Cube�� ��ü? : "+ (r instanceof Cube));
		System.out.println("�� ��ȯ r�� Rectangle�� ��ü? : "+ (c instanceof Rectangle));
		System.out.println("�� ��ȯ r�� Cube�� ��ü? : "+ (c instanceof Cube));
		System.out.println("=============================");
		System.out.println("c�� Object�� ��ü? : "+ (c instanceof Object));
	}
}