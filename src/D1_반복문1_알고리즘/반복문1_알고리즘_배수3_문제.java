package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수3_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 
			  50에서 100까지 자연수중에서 9의 배수의 개수를 출력하시오.
			  [예] (54,63,72,81,90,99)  6 개 
		 */
		
		int i = 0;
		int count = 0;
		
		int run = 1;
		while(run == 1) {
			if(i%9 == 0) {
				if(i >= 50 && i <= 100) {
					count = count +1;
					//System.out.println(i);
					
				}else if(i > 100){
					run = 0;
					System.out.println("갯수 :" + count);
				}
			}
			i += 1;
		}

	}

}
