import javax.swing.*; 
import java.awt.*; 

class BorderLayout1 extends JFrame{ 
	public BorderLayout1() {
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10, 10);
		ct.setLayout(bl);
		ct.add(new JButton("�����ʹ�ư"), BorderLayout.EAST);
		ct.add(new JButton("���ʹ�ư"), BorderLayout.WEST);
		ct.add(new JButton("���ʹ�ư"), BorderLayout.NORTH);
		ct.add(new JButton("�Ʒ��ʹ�ư"), BorderLayout.SOUTH);
		ct.add(new JButton("�߾ӹ�ư"), BorderLayout.CENTER);
		setTitle("BorderLayout Test1");
		setSize(400,300);
		setVisible(true);
	}
}  
public class BorderLayoutTest1 {
	public static void main(String[] args) {
		new BorderLayout1();
	}
}