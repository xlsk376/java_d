package D1_반복문1_프로젝트;

public class 반복문1_프로젝트_가운데값_정답 {

	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 		1~1000 사이의 숫자중 다음조건에 전부 해당하는 값을 출력하시오.
		 * 		[조건1] 28 배수를 전부 출력한다.
		    	[조건2] 가장 가운데위치의 값만 출력한다. 	    	
		    	[예] 2의 배수라고 가정했을때,  
		    		{ 2, 4, 6, 8, 10 } 출력값이 이럴때 6을 출력한다.
		    	[예] 2의 배수라고 가정했을때,  
		    		{ 2, 4, 6, 8, 10, 12 } 이런식으로 짝수라도 6을출력한다.
		 */
		
		int run = 1;
		int start = 1;
		int max = 1000;
		int i = start;
		int count = 0;
		int num = 28;
		while(run == 1) {
			if(i % num == 0) {
			//	System.out.println(i);
				count += 1;
			}	
			i += 1;
			if(i == max) {
				run = 0;
			}
		}
		//System.out.println(count);
		count = count / 2;
		//System.out.println(count * num); // 카운트된 값과 배수를 곱한다.
		// 가운데 값이기 때문에 홀수인 경우는 +1 후 곱하기, 짝수인 경우는 그냥 곱하기
//		2의 배수라고 가정했을때,  // 2의 배수는 총 5개에 출력을 위해 카운트 3을 곱한다. 6출력
//		{ 2, 4, 6, 8, 10 } 출력값이 이럴때 6을 출력한다.

	}

}
