package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�⺻�̷�3_�⺻����1 {

	public static void main(String[] args) {
		/*
	     [����1] 1~10���� �ݺ��� 5~9 ���
		 [����1] 5, 6, 7, 8, 9

		 [����2] 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		 [����2] 6, 5, 4, 3

		 [����3] 1~10���� �ݺ��� ¦���� ���
		 [����3] 2, 4, 6, 8, 10

		 */
		int i = 0;
		//[����1] 1~10���� �ݺ��� 5~9 ���
		i = 1;
		while (i <= 10) {
			if(i >= 5 && i <= 9) {
				System.out.println(i);
			}
			i += 1;
		}
		System.out.println();
		
		//[����2] 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		i = 10;
		while(i >= 1) {
			if( i <= 6 && i >= 3) {
				System.out.println(i);
			}
			i = i -1;
		}
		System.out.println();
		//[����3] 1~10���� �ݺ��� ¦���� ���
		i = 1;
		while(i <= 10) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i += 1;
		}

	}

}
