package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {

	public static void main(String[] args) {
		/*
		  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
		 */
		int a = 12;
		int b = 15;
		int count = 0;
		
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) { // ���� �ݺ�
			if(num1 < num2) {  // 12�� ����� 15�� ����� ũ��� ������ ���� �ʱ� ������ ���Ͽ� �ڽ��� ���� ���ذ���.
				num1 += a; // num1�� �ڽŰ� ���� ��+
			}else if(num2 < num1) {
				num2 += b;
			}else if(num1 == num2) { //���ذ��ٰ� 12�� 15�� ����� ũ�Ⱑ ������� ���� ���
				System.out.println(num1);
				//i = 0; //���� �ݺ� ����
				num1 += a; // num1�� num2 �񱳽� ���������� �ٽ� ���ذ�
				count += 1; // 5�� ����̱⶧����
			}
			if(count == 5) {// 5�� ����̱⶧���� 5�� ����� �����.
				break;
			}
		}
		
//		int a = 12;
//		int b = 15;
//		int count = 0;
//		int n1 = a;
//		int n2 = b;
//		int i = 1;
//		while(true) { // ��� ����� ���� �� ����Ͽ� �����ϰɸ�
//			if(i%a == 0 && i%b == 0) {
//				System.out.println(i);
//				count += 1;
//				if(count == 5) {
//					break;
//				}
//			}
//			i += 1;
//		}
		
		

	}

}
