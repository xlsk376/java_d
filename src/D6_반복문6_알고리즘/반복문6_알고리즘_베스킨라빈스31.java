package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_����Ų���31 {

	public static void main(String[] args) {
		/*
		 * [����Ų���31]
		 *   ����Ų��� �����̶�, �÷��̾� 2���� �����ư��鼭
		 *   1~3������ ���ڸ� �����Ҽ��ְ�, �׼��ڵ��� ��� ���ؼ� 
		 *   �״������� 31�� �������������� ���°����̴�.
		 * 
		 * 
		 * 1) �� �÷��̾�� �����ư��鼭 1~3�� �����Ѵ�.
		 * 2) ���࿡ �̻��Ѽ��ڸ� �Է��ϸ� 1~3�� �Է��Ҷ����� ����ڱ� �����̴�.
		 * 3) �� �÷��̾ �����Ѽ��ڴ�  total  ������ ��� �����ؼ� ���Ѵ�.
		 * 4) total �� 31�̻� �����ϸ� �¸��ڸ� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		int player = 0;
//
//		int a = 0;
//		int b = 0;
//		int temp = 0;
//		int total = 0;
//		
//		boolean run = true;
//		while(run) {
//			System.out.println("����1 : ");
//			player = scan.nextInt();
//			if(player < 1 || player > 3) {
//				System.out.println("�ٽ��Է��ϼ���.");
//				
//			}else {
//				total = total + player;
//				System.out.println(total);
//				System.out.println("����2 : ");
//				player = scan.nextInt();
//				if(player < 1 || player > 3) {
//					System.out.println("�ٽ��Է��ϼ���.");
//				}else {
//					total = total + player;
//				}
//				System.out.println(total);
//			}
//
//		}
		int p1 = 0;
		int p2 = 0;
		int total = 0;
		int turn = 1; // �÷��̾� ��
		while(true) {
			System.out.println("����Ų��� : " + total);
			if(turn % 2 == 1) { //1�� �÷��̾� ���� ���, �� Ȧ��
				System.out.println("[p1] 1~3�� �Է��ϼ��� : ");
				int me =scan.nextInt();
				if(me < 1 || me > 3) { // �߸��Է½� ���� �Ͽ��� ���Է� 
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}else {
					total += me; //�Է��Ͽ��ٸ� 1~3�� ��
					turn += 1; // ���� �ѱ�� ���� +1
				}
			}else if(turn % 2 == 0) { //2�� �÷��̾� ���� ���, �� ¦��
				System.out.println("[p2] 1~3�� �Է��ϼ��� : ");
				int me = scan.nextInt();
				if(me < 1 || me > 3) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}else {
					total += me;
					turn += 1; // ���� �ѱ�� ���� +1
				}
			}
			if(total >= 31) { //31�̻� �����̸� �¸��� ���
				break;
			}
		}
		if(turn%2 == 1) { //�ش����� Ȯ���Ͽ� �¸��� üũ
			System.out.println("p1�¸�");
		}else {
			System.out.println("p2�¸�");
		}

	}

}
