import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class JLabel1 extends JFrame implements ActionListener {
	private JLabel result = new JLabel();
	public ImageIcon i1,i2;
	public JLabel1() {
		i1 = new ImageIcon("apple.jpg");
		i2 = new ImageIcon("pear.jpg");
		JButton apple = new JButton("���");
		JButton pear = new JButton("��");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		apple.addActionListener(this);
		pear.addActionListener(this);
		setTitle("JLabel Test1");
		setSize(300,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()=="���") {
			result.setText("���ִ� ����Դϴ�");
			result.setIcon(i1);
		}else {
			result.setText("���ִ� ���Դϴ�");
			result.setIcon(i2);
		}		
	}
}
public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabel1();
	}
}
