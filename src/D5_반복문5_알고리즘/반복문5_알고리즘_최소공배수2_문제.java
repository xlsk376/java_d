package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수2_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		   	철수와 민수는 같은 수영장에 다닌다
		   	철수는 4일마다 한번씩 가고 민수는 5일만다한번씩 간다.
		   	
		   	철수와 민수가 2월 3일날 처음만났다면 다음에 서로 만나는 날은 언제인가?
		   	
		 */
		int c = 4;
		int m = 5;
		int a = c;
		int b = m;
		int count = 0;
		
		for(int i = 1; i == 1;) {
			if(a < b) {
				a += c;
			}else if(a > b) {
				b += m;
			}else if(a == b) {
				
				System.out.println("2월 " + (3+a) + "일");
				i = 0;
			}
			count += 1;
		}
		System.out.println("계산횟수 : " + count);

	}

}
