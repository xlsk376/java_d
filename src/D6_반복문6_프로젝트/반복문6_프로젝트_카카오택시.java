package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý� {

	public static void main(String[] args) {
		/*
		 * 
		 * [īī�� �ý�]
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 * 5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
		 */
		 Random ran = new Random();
		 Scanner scan = new Scanner(System.in);
		 
		 int dir = 0;
		 int x = 0;
		 int y = 0;
		 int dx = 0;
		 int dy = 0;
		 int speed = 0;
		 int money = 0;
		 int total = 0;
		 dx = ran.nextInt(21) - 10; // -10 ~ 10 => 21 // ������ ����
		 dy = ran.nextInt(21) - 10; // ������ ����
		 while(true) { // ���������� ���� �ݺ�
			 System.out.println("[������] : x : " + dx + " y : " + dy);
			 System.out.println("[������ġ] : x : " + x + " y : " + y);
			 System.out.println("[����] : " + dir + " [�ӵ�] : " + speed);
			 System.out.println("[������] : " + money + " [��ü����] : "+ total);
			 System.out.println("[1.�ӵ�] [2.����] [3.�̵�] [0.����]");
			 int sel = scan.nextInt();
			 if(sel == 0) { //���� ��ư
				 break;
			 }else if(sel == 1) { //�ӵ� �Է�
				 System.out.println("�ӵ��� �Է��ϼ��� : ");
				 speed = scan.nextInt();
				 if(speed < 1 || speed > 3) {
					 speed = 1; // 1~3 �ܿ� ���� �Է½� �⺻ ���ǵ�1�� ����
				 }
			 }else if(sel == 2) { //���� �Է�
				 System.out.println("������ �Է��ϼ��� [1.��][2.��][3.��][4.��]");
				 dir = scan.nextInt();
				 if(dir < 1 || dir > 3) {
					 dir = 1; // 1~4 �ܿ� ���� �Է½� �⺻ ������ 1�� ����
				 }
			 }else if(sel == 3) { //�̵�
				 if(dir == 1) {
					 y += speed;
				 }else if(dir == 2) {
					 x += speed;
				 }else if(dir == 3) {
					 y -= speed;
				 }else if(dir == 4) {
					 x -= speed;
				 }
				 money += speed;
			 }else {
				 System.out.println("����");
			 }
			 
			 if(dx == x && dy == y) { //������ġ�� �������� ���� ���� 
				 total += money;
				 money = 0; // ���� �̿��ڰ� �����̿��ڿ� + �� �ݾ� �����ϱ� ������ 0���� �ʱ�ȭ
				 dx = ran.nextInt(21) - 10; // -10 ~ 10 => 21
				 dy = ran.nextInt(21) - 10;
			 }
		 }

	}

}
