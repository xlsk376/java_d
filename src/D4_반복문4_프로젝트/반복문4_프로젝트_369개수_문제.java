package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_369����_���� {

	public static void main(String[] args) {
		/*
		 * [369����]
		  
			  1~ 10000 ������ ���ڸ� �Է¹ް� 
			  3�̳� 6�̳� 9��  ��������Ͻÿ�.
		 
			  ��) 9999 ==> 4
			  ��) 36 ==> 2
			  ��) 1 ==> 0
			  ��) 222 ==> 0  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int temp = num;
		while(true) {
			System.out.println(temp);
			temp = temp%10;
			
			
		}
		/*
		 * [369����]
		  
			  1~ 10000 ������ ���ڸ� �Է¹ް� 
			  3�̳� 6�̳� 9��  ��������Ͻÿ�.
		 
			  ��) 9999 ==> 4
			  ��) 36 ==> 2
			  ��) 1 ==> 0
			  ��) 222 ==> 0  
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���(1~10000)");
//		int num = scan.nextInt();
//		int temp = num;
//		int i = 0;
//		int a = 0;
//		int count = 0;
//		while(true) {
//			a = temp%10;
//			//System.out.println(a); // �ڸ��� ���
//			if(a == 3 || a == 6 || a== 9) {
//				count += 1;
//			}
//			temp = temp/10; // 10���� ���� ���� �ٽ� ����
//			if(temp == 0) { // ���̻� �������� ������ ����
//				break;
//			}
//		}
//		System.out.println(num + " ==> " + count);

	}

}
