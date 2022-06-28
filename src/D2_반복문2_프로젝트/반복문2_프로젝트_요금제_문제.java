package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_요금제_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
			  아래와같은 휴대요금제가 있다 
			  B를 선택할경우 A보다 더 경제적이될려면,
			  통화시간을 얼마까지 사용해야될까요? 
			  정답을 초로 구하시오.
			  A요금제 기본요금 17500원 초당 5원 
			  B요금제 기본요금 31000원 초당 2원
		  
		 */
		
		int am = 17500;
		int bm = 31000;
		
		int as = 5;
		int bs = 2;
		
		int t = 1; // 같은시간

		int run = 1;
		while(run == 1) {
			if(as*t + am > bs*t+bm ) { // A요금이 더 많아지는 순간
				System.out.println(t+ "초");
				run = 0;
			}
			t += 1;
			
		}
		System.out.println();
		System.out.println(t/3600 + "시간");
		System.out.println(t%3600/60 + "분");
		System.out.println(t%3600%60 + "초");
		System.out.println();
		System.out.println(4501*bs+bm);
		System.out.println(4501*as+am);
		
		/*
		 * int 차액 = 31000-17500;
		int t = 0;
			
		while(t>=0) {
			t = t + 1;
			if(t*3>차액) {
				System.out.println(t + "초");
			    t = -1;
			}
        }
		
		System.out.println(차액 + "원");
		System.out.println(4501*3);
		
		차액과 기존금액을 비교하여 확인
		 */
		

	}

}
