package D4_�ݺ���4_������Ʈ;

import java.util.Random;

public class �ݺ���4_������Ʈ_�ִ밪���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	�������� 1~10 �� 10������ϰ� , 
		 *  ����ū���� ������ ���°�� �ߺ���µ� Ƚ������Ͻÿ�.
		 */
		
		Random ran = new Random();
		
		int max = 0;
		int temp = 0;
		int count = 0;
		for(int i =1; i <= 10; i++) {
			int r = ran.nextInt(10)+1;
			System.out.println(r);
			if(max < r) { 
				max = r; // max�� ���� ū���� ��� �־��ش�.
				count = 1; // max�� ó�� ū���� �������� Ƚ�� �Ź�
						   // �Ź� max���� ���ŵɶ� ���� 1�� �ʱ�ȭ
			}else if(max == r) { 
				count += 1;  // ���� max���� �Է¹��� ���� ������ �ߺ��̱� ������ +1�����ش�.
			}
			
			
		}
		System.out.println();
		System.out.println(max);
		System.out.println(count);
		
		// �� �ۼ��� ����ε� ���ذ� ��ƴ�.
//		Random ran = new Random();
//		
//		int max = 0;
//		int count = 0;
//		int a = 0;
//		for(int i = 1; i <= 10; i++) {
//			int num = ran.nextInt(10)+1;
//			int temp = num;
//			System.out.println(num);
//			
//			if(max < temp) {
//				max = temp; // max�� ���� ū���� ��� ��
//				//count = i; // max�� ���� ū���� ���� ó�� ���� ù��°
//				count = 0; // max���� ������ �Ź� �׼��� �ʱ�ȭ ���� ū���� �����鼭 ���� ���϶� ���� ī��Ʈ�� �����ϱ� ������ 0���� �ʱ�ȭ
//						   
//
//			}
//			if(max == temp) { // ���� �Է¹��� temp���� ���� ����� max���� ��
//				count += 1;   // max���� �ߺ��ϰ�쵵 �� ��µ� �׷��� count���� �Ź� 0���� �ʱ�ȭ �ؾ���
//				//System.out.println("count : "+ count);
//				
//			}
//			
//			
//			
//		}
//		
//		System.out.println("--------------------");
//		//System.out.println(max + " " + count);
//		//System.out.println(a);

	}

}
