class ThreadTest1 extends Thread {
  public ThreadTest1(String str) {
    setName(str);
  }
  public void run() {
    for (int i=1 ; i<=1000000 ; i++) {
       System.out.println(i + getName());
    }	
    System.out.println("��" + getName());
  }
}
public class DoubleThread {
  public static void main(String args[]) {
    ThreadTest1 t1 = new ThreadTest1(" : ���� ���� �ڹ�");
    ThreadTest1 t2 = new ThreadTest1(" : ���� ����� �ڹ�");
    System.out.println("***** ������ ���� �� *****");
    t1.start();
    t2.start();
    System.out.println("***** ������ ���� �� *****");
  }
}
