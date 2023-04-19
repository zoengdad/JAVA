import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class JButton2 extends JFrame implements ActionListener {
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		ImageIcon apple = new ImageIcon("apple.jpg");
		ImageIcon banana = new ImageIcon("banana.jpg");
		ImageIcon persimmom = new ImageIcon("persimmom.jpg");
		ImageIcon pear = new ImageIcon("pear.jpg");
		ImageIcon grape = new ImageIcon("grape.jpg");
		JButton jb1 = new JButton("���",apple);
		JButton jb2 = new JButton("�ٳ���",banana);
		JButton jb3 = new JButton("��",persimmom);
		JButton jb4 = new JButton("��",pear);
		JButton jb5 = new JButton("����",grape);
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		setTitle("JButton Test2");
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}
public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();
	}
}