public class CharacterTest1 {
	public static void main(String args[]) {
		char a[] = {'a','?','��','5','A'};
		for(int i=0; i < a.length; i++) {
			System.out.println("a[" + i + "] ��° ��� = " + a[i]);
			if(Character.isDigit(a[i]))
				System.out.println("  �����Դϴ�.");
			if(Character.isLetter(a[i]))
				System.out.println("  �����Դϴ�.");
			if(Character.isUpperCase(a[i]))
				System.out.println("  �빮���Դϴ�.");	
			if(Character.isLowerCase(a[i]))
				System.out.println("  �ҹ����Դϴ�.");
		}
		if(Character.isDefined(a[2])) {
			System.out.println("a[2] ��° ��� = " + a[2]);
			System.out.println("  �����ڵ��Դϴ�.");
		}    
	}
}