package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�⺻�̷�3_�⺻����3 {

	public static void main(String[] args) {
		/*
		 
		 [����1] 1~10���� �߿��� 3�̸� 7�̻��� ���� ����Ͻÿ�.
		       1 + 2 + 7 + 8 + 9 + 10
		 [����1] 37


		 [����2] 1~10���� �߿��� 3�̸� 7�̻��� ������ ����Ͻÿ�. 
				 1,2,7,8,9,10 ==> 6�� 
		 [����2] 6
		 
		*/
		
		int i = 1;
		int total = 0;
		int count = 0;
		while(i <= 10) {
			if(i < 3 || i >= 7) { // 3�̸� �Ǵ� 7�̻��� �� 1 + 2 + 7 + 8 + 9 + 10
				total = total + i; 
				count = count + 1;
				
			}
			i += 1;
		}
		System.out.println(total);
		System.out.println(count);

	}

}
