public class CastingTest3 {
	public static void main(String args[]) {
		long l = 1234567890123456789L; 
		float f = l;  
		double d = l;  
		System.out.println("������ long�� : "+l);
		System.out.println("long >> float�� ��ȯ : "+f);
		System.out.println("long >> double�� ��ȯ : "+d);
		long fl = (long)f;
		long dl = (long)d;
		System.out.println("long >> float >> long���� ��ȯ : "+fl);
		System.out.println("long >> double >> long���� ��ȯ : "+dl);
	}
}
