import javax.swing.*; 
import java.awt.*;

class FirstFrame1 {
	public FirstFrame1(){
		JFrame jf = new JFrame("ù ��° GUI ���α׷�");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("�׽�Ʈ��ư");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);		
	}	
}
public class FrameTest1{	
	public static void main(String[] args) {
		new FirstFrame1();
  }
}