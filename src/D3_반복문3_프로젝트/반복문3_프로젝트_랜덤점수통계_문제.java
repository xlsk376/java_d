package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_���� {

	public static void main(String[] args) {
		/*
		 * [�����������]
		 * 
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . [1] ������(10��)�� ������ ����� ����Ѵ�.
		 * . [2] �հ��� ���� ����Ѵ�.
		 * . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		
		Random ran = new Random();
		
//		int temp = 0;
//		int total = 0;
//		int i = 0;
//		for(i = 0; i < 10; i++) {
//			 int score = ran.nextInt(100)+1; // 1~100
//			 total = score + ;
//			 System.out.println("���� : "+  total);
//			 System.out.println(score);
//			 
//		}System.out.println("���� : "+  total);
		int total = 0;
		int count = 0;
		int num = 0;
		int maxScore = 0;
		for(int i = 1; i <= 10; i++) {
			int r = ran.nextInt(100)+1;
			if(r >= 60) { 
				System.out.println(i + "�� �л� �հ� : " + r);// �ش� ��ȣ�� �հݻ����� Ȯ��
				count += 1;
			}else {
				System.out.println(i + "�� �л��� �հ� : " + r);// �ش� ��ȣ�� ���հݻ����� Ȯ��
			}
			if(maxScore < r) { // �������� ���ؼ� ����ū�� ���
				maxScore = r;
				num = i; // 1���л��� ���ö� ���� ��ȣ
			}
			total = total + r; // �����ջ�
		}
		System.out.println("���� : " + total + " ��� : " + total/10.0);
		System.out.println("�հݻ��� : " + count);
		System.out.println("1�� : " + num + " ���� : " + maxScore);

	}

}
