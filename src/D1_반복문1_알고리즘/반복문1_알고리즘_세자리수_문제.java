package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���ڸ���_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 *  28�� ��� �߿��� ���� ū ���ڸ� ���� ����Ͻÿ�.
		 *  �� : 980 
		 */
		int i = 0;
		int a = 0;
		//int run = 1;
		
		while(i < 1000) {
			if(i%28 == 0) {
				a = i; // 28�� ������� �ϳ��� �־���
				System.out.println(a);
				//System.out.println(i);
			}
			i += 1;
			
		}
		System.out.println(a); // �������� �ݺ����� �����鼭 ���� ū ���ڸ� �� ��� (i<1000)
		

	}

}
