package D3_�ݺ���3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_�˰���_���ٿ����_���� {

	public static void main(String[] args) {
		/*
		 *  [Up & Down ����]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , 
		 * 	  com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			int com = ran.nextInt(100)+1;
			System.out.println(com);
			while(true) {
				System.out.print("���ڸ� �Է��ϼ���(1~100) : ");
				int me = scan.nextInt();
				if(com > me) {
					System.out.println("ũ��");
					me = 0;
				}else if(com < me) {
					System.out.println("�۴�");
					me = 0;
				}else if(com == me) {
					System.out.println("����");
					break;
				}
				
			}
			break;
		}
		
		
//		while(true) {
//			System.out.println("=== ���ٿ� ���� ===");
//			int com = ran.nextInt(100) + 1;		
//			while(true) {
//				System.out.println("1~100�� �Է��ϼ��� : ");
//				int me = scan.nextInt();
//				if(me == -1000) {
//					System.out.println("ġƮŰ : " + com);
//				}
//				else if(me < com) {
//					System.out.println("������ ũ��.");
//				}
//				else if(me > com) {
//					System.out.println("������ �۴�.");
//				}
//				if(me == com) {
//					System.out.println("����.");
//					break;
//				}		
//			}
//			System.out.println("����մϱ�? yes(1) , no(2) ");
//			int con = scan.nextInt();
//			if(con == 2) {
//				System.out.println("����.");
//				break;
//			}
//		}
		
		
		

	}

}
