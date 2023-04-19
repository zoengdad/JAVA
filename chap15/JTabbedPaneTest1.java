import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioPanel extends JPanel implements ActionListener {
	JLabel jl1 = new JLabel("����� ������? ");
	JLabel jl2 = new JLabel("");
	public RadioPanel() {
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("����");
		JRadioButton jrb2 = new JRadioButton("����");
		gb.add(jrb1);
		gb.add(jrb2);
		add(jl1);
		add(jl2);
		add(jrb1);		
		add(jrb2);		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		jl2.setText(s);
	}
}

class ComboPanel extends JPanel implements ItemListener {
	JLabel jl1 = new JLabel("����� ��������? ");
	JLabel jl2 = new JLabel("");
	public ComboPanel() {
		JComboBox jcb = new JComboBox();
		jcb.addItem("A��");
		jcb.addItem("B��");
		jcb.addItem("AB��");
		jcb.addItem("O��");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}

class JTabbedPane1 extends JFrame {
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		RadioPanel rp = new RadioPanel();
		ComboPanel cp = new ComboPanel();
		jtp.addTab("����", rp);
		jtp.addTab("������", cp);
		getContentPane().add(jtp);
		setTitle("JTabbedPaneTest1");
		setSize(500,150);
		setVisible(true);
	}
}

public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabbedPane1();
	}
}