package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������_���� {

	public static void main(String[] args) {
		/*
		 * 
		 * [������ ���]
		 * 1. 5�� �ֹ��� �޴´�.
		 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��)
		 * �޴� ���� : 1
		 * �޴� ���� : 1
		 * �޴� ���� : 2
		 * �޴� ���� : 2
		 * �޴� ���� : 3
		 * �� �ݾ� = 31300��
		 * ���� �Է� : 32000
		 * === �Ե����� ������ ===
		 * 1. �Ұ�� ���� : 2��
		 * 2. ����    ���� : 2��
		 * 3. ��         �� : 1��
		 * 4. ��   ��   �� : 31300��
		 * 5. ��         �� : 700��
		 */
		Scanner scan = new Scanner(System.in);
		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		int c1 = 0;
//		int c2 = 0;
//		int c3 = 0;
//		
////		System.out.println("=== �Ե����� ===");
////		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
////		System.out.println("2.����    ���� : " + price2 + "��");
////		System.out.println("3.��         �� : " + price3 + "��");
//		
//		for(int i = 1; i < 5; i++) {
//			System.out.println("=== �Ե����� ===");
//			System.out.println("1.�Ұ�� ���� : " + price1 + "��");
//			System.out.println("2.����    ���� : " + price2 + "��");
//			System.out.println("3.��         �� : " + price3 + "��");
//			int sel = scan.nextInt();
//			if(sel == 1) {
//				c1 += 1;
//			}else if(sel == 2) {
//				c2 += 1;
//			}else if(sel == 3) {
//				c3 += 1;
//			}else {
//				System.out.println("����");
//				System.out.println("�ٽ��Է��ϼ���.");
//				i = 0;
//			}
//			
//			int sum = c1*price1 + c2*price2 + c3*price3;
//			System.out.println("�޴����� : " + sel);
//			System.out.println("�޴����� : " + sel);
//			System.out.println("�޴����� : " + sel);
//			System.out.println("�޴����� : " + sel);
//			System.out.println("�޴����� : " + sel);
//			System.out.println("�ѱݾ� : " + sum);
//			System.out.println("���� �Է� : " );
//			int cash = scan.nextInt();
//			
//			System.out.println("=== �Ե����� ������ ===");
//			System.out.println("1. �Ұ�� ���� : " + c1);
//			System.out.println("2. ����  ���� : " + c2);
//			System.out.println("3. ��     �� : " + c3);
//			System.out.println("4. ��  ��  �� : " + sum);
//			System.out.println("5. ��     �� : " + (cash - sum));
//			
//		}
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("=== �Ե����� ===");
			System.out.println("1.�Ұ����� : " + price1 + "��");
			System.out.println("2.������� : " + price2 + "��");
			System.out.println("3.�ݶ� : " + price3 + "��");
			int sel = scan.nextInt();		
			if(sel == 1) {
				c1 += 1;
			}else if(sel == 2) {
				c2 += 1;
			}else if(sel == 3) {
				c3 += 1;
			}else {
				System.out.println("����"); // ���� ������ Ƚ�� Ŭ����
				i = i - 1;				   // 2��°���� Ʋ������ �ٽ� 2��°���� ����
			}
		}
	//	System.out.println(c1 + " " + c2 + " " + c3);
		System.out.println("=== �Ե����� ������===");
		System.out.println("1.�Ұ����� : " + price1 * c1 + "�� " + c1 + "��");
		System.out.println("2.������� : " + price2 * c2+ "�� "  + c2 + "��");
		System.out.println("3.�ݶ� : " + price3 * c3+ "�� "  + c3+ "��");
	
		
		// �� ���ۼ�
//		Scanner scan = new Scanner(System.in);
//		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		int count = 0;
//		int cash = 0;
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		System.out.println("=== �Ե����� ===");
//		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
//		System.out.println("2.����    ���� : " + price2 + "��");
//		System.out.println("3.��         �� : " + price3 + "��");
//		
//	    for(int i = 1; i <= 5; i++) { // �ټ��� �ֹ�
//	    	System.out.print("�޴��� �����ϼ���.");
//	    	int sel = scan.nextInt(); // �޴�����
//	    	
//	    	if(sel == 1) { // �Ұ�� ����
//	    		a += 1;
//	    		
//	    	}else if(sel == 2) {//�������
//	    		b += 1;
//	    		
//	    	}else if(sel == 3) { // �ݶ�
//	    		c += 1;
//	    		
//	    	}else {
//	    		System.out.println("�ٽ��Է��ϼ���");
//	    		i -= 1; // ���� ������ Ƚ���� �ٽ� �ʱ�ȭ
//	    				// 2��°���� Ʋ������ 2��°���� �ٽ��ֹ�
//	    	}
//	    	
//	    }
//	    System.out.println("�ݾ��� ��������");
//	    cash = scan.nextInt();
//	    int sum = a*price1 + b*price2 + c* price3;
//	    if(cash >= sum) {
//	    	System.out.println("1.�Ұ�� ���� : " + a);
//		    System.out.println("2.����  ���� : " + b);
//		    System.out.println("3.��     �� : " + c);
//		    System.out.println("4.��  ��  �� : " + sum);
//		    System.out.println("5.��     �� : " + (cash - sum));
//	    }else if(cash < sum){
//	    	System.out.println("�ݾ��� �ٽ� �Է��ϼ���.");
//	    }

	}

}
