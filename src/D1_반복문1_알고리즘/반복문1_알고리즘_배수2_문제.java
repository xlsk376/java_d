package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수2_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 *  8의 배수를 작은수부터 4개 출력하시오. 
		 *  답 : 0,8,16,24
		 */
		/*
		int i = 0;
		int count = 0;
		while(i <= 100) {
			if(i%8 == 0) {
				count = count +1;
				if(count <= 4) {
					System.out.println(i);
				}
				
			}
			i += 1;
		}
		*/
		int num = 8;		
		int count = 0;
		int i = 0;
		
		int run = 1;		
		while(run == 1) {
			if(i % num == 0) {
				System.out.println(i);
				count = count + 1;
				if(count == 4) { //4번카운트 전에 출력하고 종료
					run = 0;
				}
			}
			i = i + 1;
		}
		

	}

}
