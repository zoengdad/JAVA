class PriorityTest extends Thread{
  public PriorityTest(String str){
    setName(str);
  }
  public void run(){
    for(int i=1; i<=5; i++){
       System.out.println( i + getName() + "  �켱���� : " + getPriority() );
    }
  }
}	
class ThreadPriority{
  public static void main(String args[]){
    PriorityTest t1 = new PriorityTest(" : ù��° ������");
    PriorityTest t2 = new PriorityTest(" : �ι�° ������");
    PriorityTest t3 = new PriorityTest(" : ����° ������");
    int priority_t1 = Integer.parseInt(args[0]);
    int priority_t2 = Integer.parseInt(args[1]);
    t1.setPriority(priority_t1);
    t2.setPriority(priority_t2);
    t3.setPriority(Thread.MIN_PRIORITY);  
    t1.start();
    t2.start();
    t3.start();
  }
}