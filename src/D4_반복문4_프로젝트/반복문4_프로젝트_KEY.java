package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY {

	public static void main(String[] args) {
		/*
		 * [Ű��ġ ã��]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20 
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		
//		Scanner scan = new Scanner(System.in);
//        int result = 99;
//        int count = 0;
//        // ����� �� ==> -1 ==> "not found"
//        // ����� �� ==> 99, 77, -1 ==> Ű�� 1���̴�. 
//        // ����� �� ==> 55, 99, 99, 99, 99, 3, -1 ==> Ű�� 2���̴�.
//		
//		while(true) {
//			System.out.print("key�� �Է� : ");
//			int key = scan.nextInt();
//			if(key == -1) {
//				System.out.println("not found");
//			}
//			if(key == 99) {
//				count += 1;
//				System.out.println("Ű�� " + count + "���̴�.");
//			}
//		}
		
		Scanner scan = new Scanner(System.in);
		int result = 99;
		int num = 0;
		int i = 1;
		boolean check = false;
		while(true) {
			System.out.println("key�� �Է� : ");
			int key = scan.nextInt();
			if(key == -1) {
				break;
			}else if(key == result && check == false) {
				check = true;
				num = i;
			}
			i += 1;
		}
		
		if(check == false) {
			System.out.println("not found");
		}else {
			System.out.println(num);
		}
		
		
		// �� ���� �ۼ���
//		Scanner scan = new Scanner(System.in);
//        int result = 99;
//        int i = 1;
//        int count = 0;
//        int a = 0;
//        int b = 0;
//        // ����� �� ==> -1 ==> "not found"
//        // ����� �� ==> 99, 77, -1 ==> Ű�� 1���̴�. 
//        // ����� �� ==> 55, 99, 99, 99, 99, 3, -1 ==> Ű�� 2���̴�.
//		
//		while(true) { // ���� ����
//			System.out.print("key�� �Է� : ");
//			int key = scan.nextInt();
//			count += 1;
//			if(key == -1) { // -1�� ������ ����
//				System.out.println("not found");
//				break;
//			}else {
//				if(key == result) {
//					a = count;
//					count = 0; // ������� ã�ұ� ������ �ʱ�ȭ����
//					
//				}
//			}
//		}
//		System.out.println("key���� : "+ result +", "+ a + "��°");

	}

}
