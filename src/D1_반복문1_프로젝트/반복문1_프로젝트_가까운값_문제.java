package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가까운값_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 		1 에서 200 사이의 숫자중 다음 조건에 전부 맞는 숫자를 출력.
		 *     	[조건1] 6의 배수를출력 (i%6 == 0 인 값)
		 *      [조건2] 100에 가장가까운 수를 출력 
		 		
		 		정답 : 102
		 */
		
		int i = 1;
		int n6 = 6;
		int front = 0;
		int back = 0;
		//int run = 1;
		while (i <= 200) { // 1~200
			if(i%n6 == 0) { //6의 배수
				//System.out.println(i); //6의 배수 출력
				if(i<=100) {
					front = 100-i;
					System.out.println(front);
				}else {
					back = i -100;
					System.out.println(back);
				}
				
				
				
			}
			i += 1; // 6의 배수 출력후 +1
		}
		//System.out.println(min);

	}

}
