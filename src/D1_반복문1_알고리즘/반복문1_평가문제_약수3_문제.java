package D1_반복문1_알고리즘;

public class 반복문1_평가문제_약수3_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 24의 약수중에서 4의 배수만출력하시오.
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
