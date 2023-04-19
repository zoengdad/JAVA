import java.util.*;

class LinkedHashMapTest1 {
	public static void main(String args[]) {
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		lm.put("����", 98);
		lm.put("����", 100);
		lm.put("����", 86);
		lm.put("��ȸ", 99);
		lm.put("����", 89);
		System.out.println("����� ���� : " + lm + total_avg(lm));
	}
	
	public static String total_avg(Map m) {
		int total = 0;
		int count = m.size();
		Collection<Integer> c = m.values();
		Iterator<Integer> iterator = c.iterator();		
		while(iterator.hasNext()) {
			total = total + iterator.next();
		}
		return "  ����=" + total + " ���=" + (double)total/count;
	}
}