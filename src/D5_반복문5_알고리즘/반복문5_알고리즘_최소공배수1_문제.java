package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_���� {

	public static void main(String[] args) {
		/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
		 */
//		int i = 1;
//		int count = 0;
//		while(true) {
//			if(i%8 == 0 && i%12 == 0) {
//				System.out.println(i);
//				break;
//			}
//			i += 1;
//			count += 1;
//			
//		}System.out.println(count); // 23�� ����Ͽ� ����ϴ� ���α׷� ���ϰ� �ɸ�
		
		int a = 8;
		int b = 12;
		int n1 = a;
		int n2 = b;
		int count = 0;
		for(int run = 1; run == 1; ) {
			if(n1 == n2) {
				System.out.println(n1 + " " + n2);
				run = 0;
			}else if(n1 < n2) {
				n1 += a;
			}else {
				n2 += b;
			}
			count += 1;		
		}
		System.out.println(count); // 4�� ����Ͽ� ����ϴ� ���α׷� ���ϰ� ����

	}

}
