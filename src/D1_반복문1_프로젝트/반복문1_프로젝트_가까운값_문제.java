package D1_�ݺ���1_������Ʈ;

public class �ݺ���1_������Ʈ_����_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 		1 ���� 200 ������ ������ ���� ���ǿ� ���� �´� ���ڸ� ���.
		 *     	[����1] 6�� �������� (i%6 == 0 �� ��)
		 *      [����2] 100�� ���尡��� ���� ��� 
		 		
		 		���� : 102
		 */
		
		int i = 1;
		int n6 = 6;
		int front = 0;
		int back = 0;
		//int run = 1;
		while (i <= 200) { // 1~200
			if(i%n6 == 0) { //6�� ���
				//System.out.println(i); //6�� ��� ���
				if(i<=100) {
					front = 100-i;
					System.out.println(front);
				}else {
					back = i -100;
					System.out.println(back);
				}
				
				
				
			}
			i += 1; // 6�� ��� ����� +1
		}
		//System.out.println(min);

	}

}
