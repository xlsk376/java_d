package D1_�ݺ���1_�˰���;

public class �ݺ���1_�򰡹���_���2_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 *  18�� ����� ���� ���ϱ�  21�� ����� ������ ����Ͻÿ�.
		 */
		
//		int i = 1;
//		//int j = 1;
//		int run = 1;
//		int count1 = 0;
//		int count2 = 0;
//		
//		while(run == 1) {
//			if(18%i == 0) { // ���ڰ� �ƴ� ���� ����ϱ� ����) int =num1;
//				count1 += 1;
//				System.out.println(i);
//			}
//			i += 1;
//			if(i > 18) {
//				run = 0; //18�� ��� ���ѵ� ���ѹݺ� ����
//			}	
//		}
//		System.out.println(count1);
//		System.out.println();
//		System.out.println(i);
//		run = 1; // ���ѹݺ������ ���� �ٽ� ����
//		i = 1; // ���� 19���� ������� i>18 ���� ���ѹݺ� ���� 1�� �ʱ�ȭ
//		while(run == 1) {
//			if(21%i == 0) { // ���ڰ� �ƴ� ���� ����ϱ� ����) int =num2;
//				count2 += 1;
//				System.out.println(i);
//			}
//			i += 1;
//			if(i > 21) {
//				run = 0;
//			}	
//		}System.out.println(count2);
//		System.out.println();
//		System.out.println(count1 + count2);
		
		int num1 = 18;
		int num2 = 21;
		
		int i = 1;
		int c1 = 0;
		while(i <= num1) {
			if(num1 % i == 0) {
				System.out.print(i + " ");
				c1 += 1;
			}
			i += 1;
		}
		System.out.println(); // while �� �ΰ� ���� ������ ������ ��� ���
		i = 1;
		int c2 = 0;
		while(i <= num2) {
			if(num2 % i == 0) {
				System.out.print(i + " ");
				c2 += 1;
			}
			i += 1;
		}
		System.out.println();
		System.out.println(c1 + " " + c2);

	}

}
