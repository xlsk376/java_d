package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		   	ö���� �μ��� ���� �����忡 �ٴѴ�
		   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
		   	
		   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
		   	
		 */
		int c = 4;
		int m = 5;
		int a = c;
		int b = m;
		int count = 0;
		
		for(int i = 1; i == 1;) {
			if(a < b) {
				a += c;
			}else if(a > b) {
				b += m;
			}else if(a == b) {
				
				System.out.println("2�� " + (3+a) + "��");
				i = 0;
			}
			count += 1;
		}
		System.out.println("���Ƚ�� : " + count);

	}

}
