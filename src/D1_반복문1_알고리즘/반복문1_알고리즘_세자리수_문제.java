package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_세자리수_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 *  28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
		 *  답 : 980 
		 */
		int i = 0;
		int a = 0;
		//int run = 1;
		
		while(i < 1000) {
			if(i%28 == 0) {
				a = i; // 28의 배수값을 하나씩 넣어줌
				System.out.println(a);
				//System.out.println(i);
			}
			i += 1;
			
		}
		System.out.println(a); // 마지막에 반복문을 나오면서 가장 큰 세자리 수 출력 (i<1000)
		

	}

}
