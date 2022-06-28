package D1_반복문1_알고리즘;

public class 반복문1_평가문제_약수2_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 *  18의 약수의 갯수 더하기  21의 약수의 갯수를 출력하시오.
		 */
		
//		int i = 1;
//		//int j = 1;
//		int run = 1;
//		int count1 = 0;
//		int count2 = 0;
//		
//		while(run == 1) {
//			if(18%i == 0) { // 숫자가 아닌 변수 사용하기 예시) int =num1;
//				count1 += 1;
//				System.out.println(i);
//			}
//			i += 1;
//			if(i > 18) {
//				run = 0; //18의 약수 구한뒤 무한반복 종료
//			}	
//		}
//		System.out.println(count1);
//		System.out.println();
//		System.out.println(i);
//		run = 1; // 무한반복종료된 값을 다시 실행
//		i = 1; // 현재 19값이 들어있음 i>18 값에 무한반복 종료 1로 초기화
//		while(run == 1) {
//			if(21%i == 0) { // 숫자가 아닌 변수 사용하기 예시) int =num2;
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
		System.out.println(); // while 을 두개 따로 돌려서 각각의 약수 출력
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
