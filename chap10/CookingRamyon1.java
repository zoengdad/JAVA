import java.util.Scanner;
class Ramyon {
	protected String boiled_pot;
	protected String boilwater(String elecpot, String water) {
		System.out.println(elecpot +"�� " + water +"�� �־� ���δ�(RamyonŬ����)");
		return "���� ��";
	}
	public void cookRamyon(String ramyon, String vegetable, int time) {
		boiled_pot = boilwater("���� ����","��");
		System.out.println(boiled_pot + "�� " + ramyon + "�� " + vegetable + "�� �ְ� " + time + "�а� ���δ�(RamyonŬ����)");
		System.out.println("�Ϲ� ��� �丮 �Ϸ�(RamyonŬ����)");		
	}
}

class RiceRamyon extends Ramyon {
	public void cookRamyon(String ramyon, String vegetable, String rice, int time) {
		boiled_pot = boilwater("���� ����","��");
		System.out.println(boiled_pot + "�� " + ramyon + "�� " + vegetable + "�� " + rice + "�� �ְ� " + time + "�а� ���δ�(RiceRamyonŬ����)");
		System.out.println("����� �丮 �Ϸ�(RiceRamyonŬ����)");			
	}
}	

class CheeseRamyon extends Ramyon {
	public void cookRamyon(String ramyon, String vegetable, String cheese, int time) {
		boiled_pot = boilwater("���� ����","��");
		System.out.println(boiled_pot + "�� " + ramyon + "�� " + vegetable + "�� " + cheese + "�� �ְ� " + time + "�а� ���δ�(CheeseRamyonŬ����)");
		System.out.println("ġ���� �丮 �Ϸ�(CheeseRamyonŬ����)");		
	}
}

public class CookingRamyon1 {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���(1:�Ϲݶ��,2:�����,3:ġ����,99:����) : ");
			Scanner stdin = new Scanner(System.in);
			s = stdin.nextInt();
			if (s == 1) {
				Ramyon r = new Ramyon();
				r.cookRamyon("�Ŷ��", "��", 5);
			} else if (s == 2) {
				RiceRamyon rr = new RiceRamyon();
				rr.cookRamyon("�ȼ�����", "����", "������", 7);
				rr.cookRamyon("Į�������", "����", 4);
			} else if (s == 3) {
				CheeseRamyon cr = new CheeseRamyon();
				cr.cookRamyon("�����", "����", "�����̽�ġ��", 6);
			}
		} while ( s != 99);
			
	}
}
