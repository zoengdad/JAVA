import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class Lab1 extends JFrame { 
	JLabel jl;
	public Lab1() {
		JButton jb1, jb2, jb3, jb4;
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("1�г�");
		jb2 = new JButton("2�г�");
		jb3 = new JButton("3�г�");
		jb4 = new JButton("4�г�");
		jl = new JLabel("��ư�� ��������");
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		jb3.addActionListener(new EventProcess());
		jb4.addActionListener(new EventProcess());;
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);		
		ct.add(jl);		
		setTitle("Lab Test1");
		setSize(300,150);
		setVisible(true);
	}
	private class EventProcess implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand());
		}		
	}
}  
public class LabTest1 {
	public static void main(String[] args) {
		new Lab1();
	}
}