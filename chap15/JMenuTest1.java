import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 

class JMenu1 extends JFrame implements ActionListener {
	JTextField jtf;
	public JMenu1() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JMenuBar jmb = new JMenuBar();
		JMenu menu1 = new JMenu("����");
		JMenu menu2 = new JMenu("����");
		JMenuItem jmi = new JMenuItem("������");
		jmi.addActionListener(this);
		menu1.add(jmi);
		jmi = new JMenuItem("�����ϱ�");
		jmi.addActionListener(this);
		menu1.add(jmi);
		jmb.add(menu1);
		jmi = new JMenuItem("����");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("�߶󳻱�");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("����");
		jmi.addActionListener(this);
		menu2.add(jmi);
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("������");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		JRadioButtonMenuItem jrbmb = new JRadioButtonMenuItem("�������ɻ���");
		jrbmb.addActionListener(this);
		menu2.add(jrbmb);
		jmb.add(menu2);
		setJMenuBar(jmb);
		jtf = new JTextField();
		c.add(jtf, BorderLayout.SOUTH);
		setTitle("JMenuTest1");
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}
public class JMenuTest1 {
	public static void main(String[] args) {
		new JMenu1();
	}
}