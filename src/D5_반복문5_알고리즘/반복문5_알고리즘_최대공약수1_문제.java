package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����1_���� {

	public static void main(String[] args) {
		/*
		[����] 
		
			6�� 8�� ������� ��� ���
		
			 ������� �� �μ��� �����ξ���� ���Ѵ�.
			 ��)    
			 	6 �Ǿ���� 1, 2, 3, 6 �̴�.
			    8 �Ǿ���� 1, 2, 4, 8 �̴�.
			    
			 6�� 8�� �������  1, 2 �̴�.
			 6�� 8�� �ִ������� 2 �̴�.
		 */
		
		int n1 = 6;
		int n2 = 8;
		int a = 0;
		int b =0;
		int i = 0;
		int max = 0;
		
		for(i = 1; i <= 8; i++) {
			if( n1%i == 0 && n2%i == 0) {
				//System.out.println(i);
				max = i; // �ִ�����
			}
		}System.out.println(max);
		

	}

}
