import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList box = new ArrayList();
		box.add("��ü �ڽ�");
		box.add(new Box("white",3,3,3));
		box.add(new Box("red",5,5,5));
		box.add(new Box("black",7,7,7));		
		System.out.println(box.get(0) + " : " + box.subList(1,4));
		for(int i = 1 ; i < box.size() ; i++) {
			Box b = (Box)box.get(i);
			System.out.println(b.color + " �ڽ��� ���Ǵ� : " + b.vol);			
		}
		/*
		ArrayList<Box> box = new ArrayList<Box>();
		//box.add("��ü �ڽ�"); ���� �߻�. Box ���� ����
		box.add(new Box("white",3,3,3));
		box.add(new Box("red",5,5,5));
		box.add(new Box("black",7,7,7));
		System.out.println("��ü �ڽ� : "+box);
		for(Box b : box) {
			System.out.println(b.color + " �ڽ��� ���Ǵ� : " + b.vol);			
		} */
			
	}
}
class Box {
	String color;
	public int vol;
	
	public Box(String c, int w, int d, int h) {
		color = c;
		vol = w*d*h;
	}
	
	@Override public String toString(){
		return color+"�ڽ�";
		
	}
}