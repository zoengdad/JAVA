class Box<T> {
	T vol;
	void setVolume(T v){
		vol=v;
	}
	T getVolume(){
		return vol;
	}
}

public class GenericsTest1 {
	public static void main(String args[]) {
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolume(200);
		//ibox.setVolume(32.3);
		System.out.println("<Integer>�ڽ��� ���Ǵ� : " + ibox.getVolume());
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(123.456);
		//dbox.setVolume(300);
		System.out.println("<Double>�ڽ��� ���Ǵ� : " + dbox.getVolume());
	}
}
