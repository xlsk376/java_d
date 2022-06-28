package D4_반복문4_프로젝트;

import java.util.Random;

public class 반복문4_프로젝트_최대값개수 {

	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 	랜덤으로 1~10 를 10번출력하고 , 
		 *  가장큰수가 여러번 나온경우 중복출력된 횟수출력하시오.
		 */
		
		Random ran = new Random();
		
		int max = 0;
		int temp = 0;
		int count = 0;
		for(int i =1; i <= 10; i++) {
			int r = ran.nextInt(10)+1;
			System.out.println(r);
			if(max < r) { 
				max = r; // max에 가장 큰값을 계속 넣어준다.
				count = 1; // max가 처음 큰값이 나왔을때 횟수 매번
						   // 매번 max값이 갱신될때 마다 1로 초기화
			}else if(max == r) { 
				count += 1;  // 만약 max값과 입력받은 값이 같으면 중복이기 때문에 +1씩해준다.
			}
			
			
		}
		System.out.println();
		System.out.println(max);
		System.out.println(count);
		
		// ↓ 작성한 방법인데 이해가 어렵다.
//		Random ran = new Random();
//		
//		int max = 0;
//		int count = 0;
//		int a = 0;
//		for(int i = 1; i <= 10; i++) {
//			int num = ran.nextInt(10)+1;
//			int temp = num;
//			System.out.println(num);
//			
//			if(max < temp) {
//				max = temp; // max에 가장 큰값이 계속 들어감
//				//count = i; // max가 가장 큰값이 제일 처음 나온 첫번째
//				count = 0; // max값이 나오면 매번 그수로 초기화 가장 큰수가 나오면서 같은 값일때 마다 카운트가 증가하기 때문에 0으로 초기화
//						   
//
//			}
//			if(max == temp) { // 위에 입력받은 temp값과 현재 저장된 max값을 비교
//				count += 1;   // max값이 중복일경우도 다 출력됨 그래서 count값을 매번 0으로 초기화 해야함
//				//System.out.println("count : "+ count);
//				
//			}
//			
//			
//			
//		}
//		
//		System.out.println("--------------------");
//		//System.out.println(max + " " + count);
//		//System.out.println(a);

	}

}
