package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수1_문제 {

	public static void main(String[] args) {
		/*
		[문제] 
		
			6과 8의 공약수를 모두 출력
		
			 공약수란 위 두수의 공통인약수를 말한다.
			 예)    
			 	6 의약수는 1, 2, 3, 6 이다.
			    8 의약수는 1, 2, 4, 8 이다.
			    
			 6과 8의 공약수는  1, 2 이다.
			 6과 8의 최대공약수는 2 이다.
		 */
		
		int n1 = 6;
		int n2 = 8;
		int a = 0;
		int b =0;
		int i = 0;
		int max = 0;
		
		for(i = 1; i <= 8; i++) {
			if( n1%i == 0 && n2%i == 0) {
				//System.out.println(i);
				max = i; // 최대공약수
			}
		}System.out.println(max);
		

	}

}
