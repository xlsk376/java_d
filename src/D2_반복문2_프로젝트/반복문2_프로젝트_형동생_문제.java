package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_형동생_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
			동생이 오후 1시에 집을 나간지 12 분후에 형이 동생을 따라 나섰다.
			동생은 시속 2km로 걷고 형은 시속 6km 로 달렸을때 형과 동생이 만나는 건 몇분후입니까?	 			
		 */
		
		// 동생은 12분 먼저 걸어감, 이거리 만큼 동생이 더 이동한 상태, 총이동거리가 동일하면 만남
		// 속력 = 거리/시간, 거리 = 속력*시간
		
//		double 동생 = 2/60.0;
//		double 형 = 6/60.0;
//		
//		int t = 0;
//		
////		int run = 1;
////		while(run ==1 ) {
////			if(동생*t == 형*t + 12*형) { // 만나는 거기때문에 동생에 12분
////				// 형*t == 동생*t + 동생*12 -> 동생은 12분동안 먼저 이동한 상태
////				// 만나는것을 물어봤으므로 위에 식이 같을때 출력
////				System.out.println(t);
////				run = 0;
////			}
////			t += 1;
////		}
//		int run = 1;
//		while(run == 1) {
//			if(형*t == 동생*t + 동생*12) {
//				System.out.println(t);
//				run = 0;
//			}
//			t += 1;
//		}
		
		double 동생 = 2/60.0;
		double 형 = 6/60.0;
		
		int a = 1;			
		boolean run = true;
		while(run == true) {			
			if(형 * a == 동생 * a + 동생 * 12) {
				System.out.println("걸린시간 : " + a  + "분");
				run = false;
			}
			a = a + 1;
		}
		

	}

}
