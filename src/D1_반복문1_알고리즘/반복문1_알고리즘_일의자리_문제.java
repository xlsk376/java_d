package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_�����ڸ�_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	9�� ����� ���� �ڸ��� 6�� ù��° ��� ����Ͻÿ�.
		 *  �� : 36
		 */
		
		int i = 0;
		int run = 1;
		while(run == 1) {
			if(i%9 == 0) {
				if(i%10 == 6) {
					System.out.println(i);
					run = 0;
				}
			}
			i += 1;
		}

	}

}
