class DoubleThreadTest2 extends Thread {
  public DoubleThreadTest2(String str) {
    setName(str);
  }
  public void run() {
    for (int i=1 ; i<=3 ; i++) {
       System.out.println(i + getName());
    }	
    System.out.println("��" + getName());
  }
}
public class DoubleThread2 {
  public static void main(String args[])throws Exception {
    DoubleThreadTest2 t1 = new DoubleThreadTest2(" : ���� ���� �ڹ�");
    DoubleThreadTest2 t2 = new DoubleThreadTest2(" : ���� ����� �ڹ�");
    System.out.println("***** ������ ���� �� *****");
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("***** ������ ���� �� *****");
  }
}
