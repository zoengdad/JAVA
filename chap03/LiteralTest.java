public class LiteralTest {
	public static void main(String[] args) {
		int a = 100;
		int b = 0b1100100;
		int c = 0144;
		int d = 0x64;
		System.out.println("10���� 100 = " + a);
		System.out.println("2���� 0b1100100 = " + b);
		System.out.println("8���� 0144 = " + c);
		System.out.println("16���� 0x64 = " + d);
		System.out.println("2���� 0b111 = " + 0b111);
		System.out.println("8���� 0777 = " + 0777);
		System.out.println("16���� 0xfff = " + 0xfff);
	}
}