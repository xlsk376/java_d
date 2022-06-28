package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_자전거_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
			학교에서 집까지 갈때 시속 15km로 자전거를 타고 가면 6km로 걸어가는거보다 
			18분  빨리 도착한다고 한다.
			학교에서 집까지의 거리를 구하시오.
		 */
		
		// 시속 = 분속 * 60
		// 분속 = 시속 / 60
		
		// 학교 - 집 => 자전거 15; , 학교 - 집 => 걷기 6; + 걷기*18( 걷기가 18분 늦게 도착) 
		// 속력 = 거리/시간, 거리 = 속력*시간 , 같은 거리를 이동
		
		double 자전거 = 15/60.0;
		double 걷기 = 6/60.0;
//		System.out.println(자전거);
//		System.out.println(걷기);
//		double 시간 = 18;
//		double 거리 = 1; // 속력 = 거리/시간 
//		
//		int run = 1;
//		while(run == 1) {
//			if((거리/자전거 - 시간) == (거리/걷기 ) ) { //시간을 빼는게 아님
//				System.out.println(거리);
//				run = 0;
//			}
//			거리 += 1;
//		}
		
		int a = 0; // 시간
		int run = 1;
		while(run == 1) {
			if(자전거* a == 걷기*a + 걷기*18) { // 거리가 같으면 출력되게함,걷기*18은 자전거가 빨리도착한 거리
				//System.out.println(a);
				System.out.println(a + " " + a*자전거);
				run = 0;
			}
			a += 1;
		}
		

	}

}
