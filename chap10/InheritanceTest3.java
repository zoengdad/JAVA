class C1 {
	private static int x=100;
	public static int y = x;
	static int z=x;
 	public static int cc() { return x;}
}
class C2 extends C1 {
	public static String x;
	static int y;
}
class InheritanceTest3 {
	public static void main(String args[]) {
		System.out.println("Ŭ���� �޼ҵ� C1.cc() �� : " + C1.cc());
		System.out.println("Ŭ���� ���� C1.y �� : " + C1.y);
	    System.out.println("Ŭ���� ���� C1.z �� : " + C1.z);
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.x);
	    System.out.println("Ŭ��1�� ���� C2.y �� : " + C2.y);
	    System.out.println("Ŭ���� ���� C2.z �� : " + C2.z);
	    System.out.println("Ŭ���� �޼ҵ� C2.cc() �� : " + C2.cc());
	    C2.x = "ó�� �����ϴ� �ڹ�";
	    C2.y = 200; 
	    C1.z = 300;//C2.z = 300;�� ����
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.x);
	    System.out.println("Ŭ���� ���� C2.y �� : " + C2.y);
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.z);
  }
}
