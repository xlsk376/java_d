package D1_�ݺ���1_������Ʈ;

public class �ݺ���1_������Ʈ_����_���� {
	/*
	 * [����] 
	 * 		1 ���� 200 ������ ������ ���� ���ǿ� �����ش��ϴ� ���ڸ� ����Ͻÿ�.
	 *     	[����1] 6�� ��������
	 *      [����2] 100�� ���尡��� ���� ��� 
	 		
	 		���� : 102
	 */
	public static void main(String[] args) {
		
		int limit = 100; // 100 ����
		int start = 1;
		int max = 200;
		int num = 6;
		int i = start;	
		int front = 0;
		int back = 0;
		while(i <= max) {
			if(i % num == 0 && i <= limit) { //limit 100����
				//System.out.println(i);
				front = i;
			}		
			i += 1;
		}
		System.out.println(front);
		back = front + num; // 100�Ʒ��߿� 6�� ����� ����ū�� +6
		//System.out.println(front + " " + back);	
		if(limit - front > back - limit) {
			System.out.println(back);
		}else if(limit - front < back - limit) {
			System.out.println(front);
		}else if(limit - front == back - limit){
			System.out.println(front + " " + back);
		}

	}

}
