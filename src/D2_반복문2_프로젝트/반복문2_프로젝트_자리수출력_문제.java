package D2_�ݺ���2_������Ʈ;

import java.util.Random;

public class �ݺ���2_������Ʈ_�ڸ������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
			 [1] 1~99999 ������ �������ڸ� �����ϰ� �ڸ����� ���ڸ����� ����ϰ�,
			 [2] ���߿� 9�� ������ ���.
			 
			 ��) 8 ==> 1 , 0
			 ��) 102 ==> 3 , 0
			 ��) 88 ==> 2 , 0
			 ��) 919 ==> 3, 2
		 */
		
//		Random ran = new Random();
//		int num = ran.nextInt(99999)+1;
//		int �ڸ��� = 0;
//		int ���� = 0;
//		int temp = num;
//		int n10000 = num/10000;
//		int n1000 = num%10000/1000;
//		int n100 = num%10000%1000/100;
//		int n10 = num%10000%1000%100/10;
//		int n1 = num%10000%1000%100%10;
//		
//		boolean run = true;
//		while(run == true) {
//			temp = temp /10; // �ڸ��� ����̹Ƿ� �����ڸ��� ������ ī��Ʈ�� �ڸ���
//			�ڸ��� += 1;
//			if(n10000 == 9 || n1000 == 9 || n100 == 9 || n10 == 9 || n1 == 9) {
//				���� += 1;
//			}
//			
//			
//			
//			if(temp == 0) {
//				run = false;
//			}
//			
//			//�ڸ��� += 1;
//		}
//		System.out.println(num + " " + �ڸ��� + " " + ����);
//		System.out.println(n10000);
//		System.out.println(n1000);
//		System.out.println(n100);
//		System.out.println(n10);
//		System.out.println(n1);
		
		
		Random ran = new Random();
		int r = ran.nextInt(99999)+1;
		//System.out.println(r);
		int temp = r;
		int count = 0;
		int a = 0;
		int �ڸ��� = 0;
		while(true) {
			//System.out.println(temp);
			a = temp%10;
			if(a == 9) {
				count += 1;
			}
			temp = temp/10;
			�ڸ��� += 1;
			if(temp == 0) { // �������� 0�� �Ǹ� ���� ū���� �ڸ����� ��¸��ϰ� ��������
				break;		// ���̻� ������ ������쿡 �������;� �� �ڸ����� ����ϰ� ����
			}
		}
		
		System.out.println(r + " ==> " + �ڸ��� + " , "+count);

	}

}
