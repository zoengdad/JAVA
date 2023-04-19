import java.util.Arrays;
import java.util.Random;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class Lotto extends JFrame implements ActionListener {
	private JLabel lotto_num = new JLabel();
	public Lotto() {
		JButton lotto = new JButton("�ζ� ��ȣ �ڵ�����");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(lotto);
		ct.add(lotto_num);
		lotto.addActionListener(this);
		setTitle("Lotto Number Generate");
		setSize(300,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		Random r = new Random();
		int[] lnum = new int[6];
		int tmp;
		int i = 0;
		a : while(i < 6) {
			tmp = r.nextInt(45)+1;
			for(int j = 0 ; j <= i ; j++) {
				if (tmp == lnum[j])
					continue a;
			}
		lnum[i]=tmp;
		i++;
		}
		lotto_num.setText("�̹� �� �ζ� ��÷��ȣ : "+Arrays.toString(lnum));
	}
}

public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}
