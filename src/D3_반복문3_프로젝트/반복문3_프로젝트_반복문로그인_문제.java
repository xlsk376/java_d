package D3_�ݺ���3_������Ʈ;

import java.util.Scanner;

public class �ݺ���3_������Ʈ_�ݺ����α���_���� {

	public static void main(String[] args) {
		/*
		 * 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
		 * 2. �α׾ƿ� . �α��� �� �̿밡��
		 * 3. �α���,�α׾ƿ� ������ log ������ �̿��Ѵ�.
		 *  [��] -1(�α׾ƿ�), 1111(id1), 2222(id2)
		 */
		// �α��� 
		// �α׾ƿ� 
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(�α׾ƿ�), 1111(id1), 2222(id2)
		// �ش��ϴ� ID�� �α��� �Ǿ��ִ��� Ȯ��

		boolean run = true;
		while (run == true) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log == -1) {// �α����� �ȵȻ��� ���� : �α׾ƿ�
					System.out.println("ID : ");
					int id = scan.nextInt();
					System.out.println("PW : ");
					int pw = scan.nextInt();
					if(id == id1 && pw == pw1) {
						log = id1; // ���� id1�� �α����� ���� log������ id1�� ����
					}else if(id == id2 && pw == pw2) {
						log = id2; //id1�� �ƴ϶�� id2���� log�� ����
					}
					System.out.println(log + "�� �α��μ���");
				}else {
					System.out.println("�α׾ƿ����� �̿밡��");//�α��� �����̱� ������ �α׾ƿ��� ����ؾ���
				}
			} else if (sel == 2) {
				if(log != -1) { //�α׾ƿ��� �α׾ƿ����°� �ƴ϶�� log���� �α׾ƿ����·� ����
					log = -1;
				}else { // �α׾ƿ����¶�� �α����� �϶�� ������
					System.out.println("�α����� �ϼ���.");
				}
			} else if (sel == 0) { 
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		

	}

}
