package D1_�ݺ���1_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���1_�⺻�̷�4_���� {

	public static void main(String[] args) {
		/*
		 * [�ݺ��� ����] 
		 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�. 
		 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�. 
		 * ��) 
		 * ���� �Է�[EXIT:-100] : 1
		 * ���� �Է�[EXIT:-100] : 3 
		 * ���� �Է�[EXIT:-100] : 4 
		 * ���� �Է�[EXIT:-100] : -100 
		 * ���α׷� ����
		 */

		Scanner scan = new Scanner(System.in);

		int i = 1;
		while (i == 1) { // ���ѹݺ�
			System.out.println("���� �Է�[EXIT:-100] : ");
			int input = scan.nextInt();
			if (input == -100) {
				System.out.println("����");
				i = 0;
			}
		}
	}

}
