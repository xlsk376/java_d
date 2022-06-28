package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가까운값_정답 {
	/*
	 * [문제] 
	 * 		1 에서 200 사이의 숫자중 다음 조건에 전부해당하는 숫자를 출력하시오.
	 *     	[조건1] 6의 배수를출력
	 *      [조건2] 100에 가장가까운 수를 출력 
	 		
	 		정답 : 102
	 */
	public static void main(String[] args) {
		
		int limit = 100; // 100 가까운값
		int start = 1;
		int max = 200;
		int num = 6;
		int i = start;	
		int front = 0;
		int back = 0;
		while(i <= max) {
			if(i % num == 0 && i <= limit) { //limit 100가까운값
				//System.out.println(i);
				front = i;
			}		
			i += 1;
		}
		System.out.println(front);
		back = front + num; // 100아래중에 6의 배수중 가장큰수 +6
		//System.out.println(front + " " + back);	
		if(limit - front > back - limit) {
			System.out.println(back);
		}else if(limit - front < back - limit) {
			System.out.println(front);
		}else if(limit - front == back - limit){
			System.out.println(front + " " + back);
		}

	}

}
