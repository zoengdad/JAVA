class Am {
	int count=1;
	void callme() {
		System.out.println("Am�� callme() ����, count �� : "+count);
	}
}
class Bm extends Am {
	int count=2;
	void callme() {     
		System.out.println("Bm�� callme() ����, count �� : "+count);
	}
}

class Cm extends Am {   
	int count=3;
	void callme() {     
		System.out.println("Cm�� callme() ����, count �� : "+count);
	}
}

class PolymorphismTest1 {
	public static void main(String args[]) {
		Am r = new Am();
		r.callme();
		System.out.println("r.count �� : " + r.count);
		r = new Bm();
		r.callme();
		System.out.println("r.count �� : " + r.count);
	    r = new Cm();
	    r.callme();
	    System.out.println("r.count �� : " + r.count);
	}
}
