package D2_�ݺ���2_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���2_������Ʈ_���ڸ������� {

	public static void main(String[] args) {
		/*
		 * [����]
			 1~999 ������ �������ڸ� �����ϰ� �� �ڸ����� ���� ����Ͻÿ�.
			 ��) 8 ==> 8
			 ��) 28 ==> 2 + 8
			 ��) 999 ==> 9 + 9 + 9
		 */
		
//		Random ran = new Random();
//		int num = ran.nextInt(999)+1; // 1~999
//		System.out.println(num);
//		int n100 = num/100;
//		int n10 = num%100/10;
//		int n1 = num%100%10;
////		System.out.println(n100);
////		System.out.println(n10);
////		System.out.println(n1);
//		
//		int run = 1;
//		while(run == 1) {
//			if(num <= 999 && num >= 100) {
//				//System.out.println(num);
//				num = n100 + n10 + n1;
//				System.out.println(num);
//			}else if(num <= 99 && num >=10) {
//				//System.out.println(num);
//				num = n10 + n1;
//				System.out.println(num);
//			}else if(num <= 9 && num >=1) {
//				System.out.println(num);
//			}
//			run = 0;
//			
//		}
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//int num = ran.nextInt(999)+1;
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		int i = 0;
		int a = 0;
		
		int run = 1;
		while(run == 1) { // 10���� ���� �������� ������ 1�� �ڸ�
						  // �ݺ������� 10���� �������� 0�� �ɶ����� ������.
			a = temp%10; // �ڸ��� ���, ���� �������� �ڸ����� ��
			sum = sum + a; // �ڸ����� ��
			temp = temp/10; //������ �������� �ٽ� ���� ��) 111/10 = 11 // 111�� �ʱⰪ 11�� ������ ������ ��
			if(temp == 0) { // �ȳ�������� Ż��!
				run = 0;
			}
		
			i += 1;

		}
		System.out.println(sum);
		

	}

}
