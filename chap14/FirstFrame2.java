import javax.swing.*; 
import java.awt.*;

public class FirstFrame2 {
	public FirstFrame2(){
		JFrame jf = new JFrame("�� ��° GUI ���α׷�");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("�׽�Ʈ��ư");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);		
	}
	public static void main(String[] args) {
		new FirstFrame2();
	}
}
