package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_��Ÿ�̷�6_�ڷΰ��� {

	public static void main(String[] args) {
		/*
		 * [�ڷΰ���]
		 *      ���θ����θ޴����� �����Ƿ��� ������
		 *      �ڷΰ��� ������������ �����Ƿ� �������� �����ҷ����Ѵ�.
		 * 		
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("1.Ƽ����");
					System.out.println("2.����");
					System.out.println("0.�ڷΰ���");
					System.out.println("�޴� ���� : ");
					int sel2 = scan.nextInt();
					
					if(sel2 == 1) {
						System.out.println("Ƽ����");
					}else if(sel2 == 2) {
						System.out.println("����");
					}else if(sel2 == 0) {
						System.out.println("�ڷΰ���");
						run2 = false;
					}
					
				}
			}else if(sel == 2) {
				boolean run3 = true;
				while(run3) {
					System.out.println("1.�����");
					System.out.println("2.ġ��");
					System.out.println("0.�ڷΰ���");
					System.out.println("�޴� ���� : ");
					int sel3 = scan.nextInt();
					
					if(sel3 == 1) {
						System.out.println("Ƽ����");
					}else if(sel3 == 2) {
						System.out.println("����");
					}else if(sel3 == 0) {
						System.out.println("�ڷΰ���");
						run3 = false;
					}
					
				}
			}else if(sel == 0) {
				System.out.println("���α׷� ����");
				run = false;
			}
		}

	}

}
