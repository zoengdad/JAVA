import java.util.*;
class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		for(int i=1 ; i <= 5 ; i=i+2 ){
			odd.add(i);
			even.add(i+1);
		}
		boolean setChanged = odd.add(5);
		System.out.println("odd�� 5 �߰� ����? : " + setChanged);
		setChanged = even.add(12);
		System.out.println("even 12 �߰� ����? : " + setChanged);
		System.out.println("odd ���� : " + odd);
		System.out.println("even ���� : "+ even);
		System.out.println("odd���� ���� ���� ���� : "+Collections.min(odd));
		System.out.println("even���� ���� ū ���� : "+Collections.max(even));
		Iterator<Integer> it = even.iterator();
		int sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("even ������ ���� : "+sum);
	}
}
