package D3_�ݺ���3_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���3_�⺻�̷�5_continue��else���ذ� {

	public static void main(String[] args) {
		/*
		 *       continue �� else �� �̿��ؼ� ����� ��������ʰ� ���� ��������ִ�.
		 *       continue �� ���� �����ص��ȴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			else{
				if (sel == 1) {
					System.out.println("�ܹ���");
				} else if (sel == 2) {
					System.out.println("�ݶ�");
				} else if (sel == 3) {
					System.out.println("����");
				}
			}		
		}
		

	}

}
