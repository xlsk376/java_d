package D1_�ݺ���1_�˰���;

public class �ݺ���1_�򰡹���_���3_���� {

	public static void main(String[] args) {
		/*
		 * [����] 24�� ����߿��� 4�� ���������Ͻÿ�.
		 */
		int i = 1;
		int count = 0;
		int num = 24;
		while (i <= num) {
			if (num % i == 0) {
				//count = i;
				// System.out.println(i);
				if (i % 4 == 0) {
					System.out.print(i);
					count = count + 1;
					if (count < 4) {
						System.out.print(",");
					}
				}
			}
			i += 1;

		}

	}

}
