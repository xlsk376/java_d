package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���3_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
			  50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
			  [��] (54,63,72,81,90,99)  6 �� 
		 */
		
		int i = 0;
		int count = 0;
		
		int run = 1;
		while(run == 1) {
			if(i%9 == 0) {
				if(i >= 50 && i <= 100) {
					count = count +1;
					//System.out.println(i);
					
				}else if(i > 100){
					run = 0;
					System.out.println("���� :" + count);
				}
			}
			i += 1;
		}

	}

}
