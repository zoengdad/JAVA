import javax.swing.*; 
import java.awt.*;

class FirstFrame3 extends JFrame  {
	public FirstFrame3(){
		Container ct = getContentPane();
		JButton jb = new JButton("�׽�Ʈ��ư");
		ct.add(jb);
		setTitle("�� ��° GUI ���α׷�");
		setSize(400,300);
		setVisible(true);		
	}	
}
public class FrameTest2{	
	public static void main(String[] args) {
		new FirstFrame3();
  }
}