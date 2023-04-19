import java.util.*;

class LinkedListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		long start, stop;
		
		start = System.currentTimeMillis();
		for (int i=0 ; i<=100000000 ; i++) 
			alist.add(i);
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - ������ ���� : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (int i=0 ; i<=100000000 ; i++)
			llist.add(i);
		stop = System.currentTimeMillis();
		System.out.println("LinkedList - ������ ���� : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (int i=0 ; i < 1000 ; i++)
			alist.add(500,i);
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - �߰� ���� : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (int i=0 ; i < 1000 ; i++)
			llist.add(500,i);
		stop = System.currentTimeMillis();
		System.out.println("LinkedList - �߰� ���� : " + (stop-start));
	}
}
