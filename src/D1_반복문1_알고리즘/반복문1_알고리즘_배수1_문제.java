package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���1_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	7�� �����  150���� �������� ����ū�� ����Ͻÿ�. (� ���� ����� �� ���� ������ ���� ���̴�.) 
		 *  �� : 147
		 */
		/*
		 int i = 0; 
		 int a = 0;
		 while(i <150) {
			 if(i % 7 == 0) { // 0�� ������ ���(����)
				 a = i; // a�� 7�� ��� ���� �ݺ��ؼ� ������� ��) 7, 14, 21 ....
				 //System.out.println(i);
			 }
			 i = i +1;
		 }
		 System.out.println(a); // a�� 150���� ���� ���߿� ����ū�� ���
		 */
		
		int num = 7;
		int result = 0;
		
		int i = 1;
		while(i == 1) {
			if(num >= 150) {
				i = 0; // ���ѹݺ� ����
			}
			else {
				result = num;
				num += 7;
			}
		}
		System.out.println(result); // ������ ���� ���

	}

}
