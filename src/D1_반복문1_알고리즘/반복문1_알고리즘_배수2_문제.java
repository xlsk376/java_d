package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���2_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 *  8�� ����� ���������� 4�� ����Ͻÿ�. 
		 *  �� : 0,8,16,24
		 */
		/*
		int i = 0;
		int count = 0;
		while(i <= 100) {
			if(i%8 == 0) {
				count = count +1;
				if(count <= 4) {
					System.out.println(i);
				}
				
			}
			i += 1;
		}
		*/
		int num = 8;		
		int count = 0;
		int i = 0;
		
		int run = 1;		
		while(run == 1) {
			if(i % num == 0) {
				System.out.println(i);
				count = count + 1;
				if(count == 4) { //4��ī��Ʈ ���� ����ϰ� ����
					run = 0;
				}
			}
			i = i + 1;
		}
		

	}

}
