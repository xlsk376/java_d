package D4_�ݺ���4_�˰���;

import java.util.Random;

public class �ݺ���4_�˰���_����ū����ȣ_���� {

	public static void main(String[] args) {
		/*
		 * [����1] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 1) ���������� ����ū���� ��ȣ�� ��� (��ȣ�� ��¼����̴�.) 2)
		 * ����ū���� �������ִٸ� ����ù��° ��ȣ�� ��� ��) 1, 7, 4, 7, 5 ==> ����ū�� : 7 , ��ȣ : 2 ����ū���� 2������
		 * ù��°��ȣ�� ���
		 * 
		 * [����2] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 1) ���������� ����ū���� ��ȣ�� ��� (��ȣ�� ��¼����̴�.) 2)
		 * ����ū���� �������ִٸ� ���帶���� ��ȣ�� ��� ��) 1, 7, 4, 7, 5 ==> ����ū�� : 7 , ��ȣ : 4 ����ū���� 2������
		 * ������ ��ȣ�� ���
		 */

		Random ran = new Random();

		// int count = 0; // ū���� ī��Ʈ�� üũ�Ѱ��� �ʿ���� �߸��ۼ�
//		 int i = 1;
//		 int num = 0;
//		 int max = 0;
//		 //int r = 0;
//		 while(i <=9) {
//			 r = ran.nextInt(9)+1; 
//			 System.out.println(r);
//			 if(max < r) {
//				 max = r;
//				 //count += 1; // ū���� ī��Ʈ�� üũ�Ѱ��� �ʿ���� �߸��ۼ�
//				 //System.out.println("ū�� : " + max + " ��ȣ : " + i);
//				 num = i;
//			 }
//			 //System.out.println(r);
//			 i += 1;
//		 }
//		 //System.out.println("����ū�� : " +max + " ��ȣ : " /*+ count*/);
//		 System.out.println("����ū�� : " +max + " ��ȣ : " + num);

		System.out.println("--------------------------------");
		System.out.println();

//		 i = 1;
//		 num = 0;
//		 max = 0;
//		 while(i <= 9) {
//			 int r = ran.nextInt(9)+1;
//			 //System.out.println(r);
//			 if(max < r) {
//				 max = r;
//				 System.out.println(max);
//			 }
//			 System.out.println(r);
//			 i += 1;
//		 }

		int i = 1;
		int max = 0;
		int number = 0;
		while (i <= 9) {
			int r = ran.nextInt(9) + 1;
			if (max <= r) {
				max = r;
				number = i;

			}
			System.out.println(r);
			i += 1;
		}
		System.out.println("�ƽ� : " + max + " ��ȣ : " + number);
		
		// �� �籸���غ�
//		for(i = 1; i <= 5; i++) {
//			int num = ran.nextInt(9)+1;
//			System.out.println(num); 
//			if(max < num) {
//				max = num;
//				//count = i;
//			}
//			if(max == num) { // max���� �������� ������ �ݺ��� i�� count�� ����ִ´�.
//				count = i;
//			}
//			
//		}
//		System.out.println("���� ū �� : " + max + ", " + "��ȣ : "+ count);

	}

}
