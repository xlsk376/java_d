package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_운동_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 철수는 저녁 6시 30분에  집에서 3km 떨어진 공원을 가는데,
		 * 처음에는 시속 3km로 걷다가 도중에 시속 6km로 달려갔다.
		 * 철수는 공원에 7시  10에도착했다.
		 * 걸어간 거리와 달려간 거리를 구하시오.
		 */
		
		double 걷기속력 = 3/60.0;
		double 달리기속력 = 6/60.0;
		
		int 총시간 = 40;
		int 총거리 = 3;
		int 걷기거리 = 총거리;
		int 달리기거리 = 0;
		// 6시30분 ~ 7시10분 : 걸린시간 40분, 편도 3; 
		//총거리를 걷기 + 달리기로 이동, 속력 = 거리/시간  거리 = 시간*속력
		int run = 1;
		while(run == 1) {
			if(걷기거리/걷기속력 + 달리기거리/달리기속력 == 총시간 && 걷기거리 + 달리기거리 == 총거리) {
				System.out.println(걷기거리 + " " + 달리기거리);
				run = 0;
			}
			걷기거리 -= 1;
			달리기거리 += 1;
		}
		
		
		
		

	}

}
