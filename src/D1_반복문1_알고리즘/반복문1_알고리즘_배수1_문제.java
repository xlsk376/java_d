package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수1_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 	7의 배수중  150보다 작은수중 가장큰수 출력하시오. (어떤 수의 배수는 그 수에 정수를 곱한 수이다.) 
		 *  답 : 147
		 */
		/*
		 int i = 0; 
		 int a = 0;
		 while(i <150) {
			 if(i % 7 == 0) { // 0은 모든수의 배수(포함)
				 a = i; // a에 7의 배수 값을 반복해서 집어넣음 예) 7, 14, 21 ....
				 //System.out.println(i);
			 }
			 i = i +1;
		 }
		 System.out.println(a); // a는 150보다 작은 수중에 가장큰수 출력
		 */
		
		int num = 7;
		int result = 0;
		
		int i = 1;
		while(i == 1) {
			if(num >= 150) {
				i = 0; // 무한반복 해제
			}
			else {
				result = num;
				num += 7;
			}
		}
		System.out.println(result); // 마지막 값만 출력

	}

}
