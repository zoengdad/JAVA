class Box2 {
	int width=10;
	int height=20;
	int depth=30;
}
public class Box2Test1 {
	public static void main(String args[]) {
		int myint1 = 100;
		int myint2 = myint1;
		System.out.println("ù ��° �� : " + myint1 + " �� ��° �� : " + myint2);
		myint1 = 200;
		System.out.println("ù ��° �� : " + myint1 + " �� ��° �� : " + myint2);   
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2();
		mybox1.width = 20;
		mybox2.depth = 123;
		System.out.println("mybox1.width : " + mybox1.width);
		System.out.println("mybox1.height : " + mybox1.height);
		System.out.println("mybox1.depth : " + mybox1.depth);
		
		System.out.println("mybox2.width : " + mybox2.width);
		System.out.println("mybox2.height : " + mybox2.height);
		System.out.println("mybox2.depth : " + mybox2.depth);

		Box2 mybox3 = mybox2;
		mybox2.width = 1000;
		mybox2.height = 2000;
		System.out.println("mybox3.width : " + mybox3.width);
		System.out.println("mybox3.height : " + mybox3.height);
		System.out.println("mybox3.depth : " + mybox3.depth);
	}
}