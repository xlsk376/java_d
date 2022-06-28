package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수1_문제 {

	public static void main(String[] args) {
		/*
		[문제]
		  8 과 12 의 최소 공배수를 구하시요
			 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
			 예) 8 16 24... 
			 예) 12 24....
			 여기서 24가 최소공배수이다.
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
//		}System.out.println(count); // 23번 계산하여 출력하는 프로그램 부하가 걸림
		
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
		System.out.println(count); // 4번 계산하여 출력하는 프로그램 부하가 적음

	}

}
