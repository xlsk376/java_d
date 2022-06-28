package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가운데값_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 1~1000 사이의 숫자중 다음조건에 전부 해당하는 값을 출력하시오. [조건1] 28 배수를 전부 출력한다. [조건2] 가장
		 * 가운데위치의 값만 출력한다.
		 * 
		 * [예] 2의 배수라고 가정했을때, { 2, 4, 6, 8, 10 } 출력값이 이럴때 6을 출력한다. [예] 2의 배수라고 가정했을때, {
		 * 2, 4, 6, 8, 10, 12 } 이런식으로 짝수라도 6을출력한다.
		 */

		int i = 1;
		int count = 0;
		int num = 3;

		while (i <= 100) {
			if (i % num == 0) {
				count += 1;
				System.out.println(i);
			}
			i += 1;
		}
		System.out.println(count);
		if (count % 2 == 0) {
			count = count / 2;
			System.out.println(count * num);

		} else {
			count = (count / 2) + 1;
			System.out.println(count * num);
		}
		// 카운트된 값과 배수를 곱한다.
//		2의 배수라고 가정했을때,  // 2의 배수는 총 5개에 출력을 위해 카운트 3을 곱한다. 6출력
//		{ 2, 4, 6, 8, 10 } 출력값이 이럴때 6을 출력한다.

	}

}
