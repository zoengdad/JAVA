import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class Event1 extends JFrame implements ActionListener{ 
	JLabel jl;	
	public Event1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JButton jb = new JButton("��ư");
		jl = new JLabel("��ư�� ��������");
		jb.addActionListener(this);
		ct.add(jb);
		ct.add(jl);		
		setTitle("Event Test1");
		setSize(200,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		jl.setText("�� �ϼ̾��");
	}
}  
public class EventTest1 {
	public static void main(String[] args) {
		new Event1();
	}
}