import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class Event2 extends JFrame { 
	JLabel jl;
	JButton jb1, jb2;
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("����մϴ�");
		jb2 = new JButton("�ູ�մϴ�");
		jl = new JLabel("��ư�� ��������");
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);		
		setTitle("Event Test2");
		setSize(250,150);
		setVisible(true);
	}
	private class EventProcess implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand());
		}		
	}
}  
public class EventTest2 {
	public static void main(String[] args) {
		new Event2();
	}
}