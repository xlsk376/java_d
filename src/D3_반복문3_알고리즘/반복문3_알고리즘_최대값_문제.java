package D3_�ݺ���3_�˰���;

import java.util.Scanner;

public class �ݺ���3_�˰���_�ִ밪_���� {

	public static void main(String[] args) {
		/*
		 * 	[�ִ밪 ���ϱ�]
		 * 1. �ݺ����ȿ��� ����ؼ� ���� �Է¹޴´�. ( -1000 ����ū�����Է¹޴´�.)
		 * 2. �Է¹��������� ����ū���ڸ� ����Ѵ�.
		 * 3. -1000 ���� ���ϸ�  �Է��ϸ� �����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int max = -1000;
		
		boolean run = true;
		while(run) {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
			if(num <= -1000) {
				System.out.println("����");
				run = false;
			}else {
				if(max < num) {
					max = num;
					System.out.println("����ū�� : " + max);
				}
			}
			
		}

	}

}
