package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수3_정답 {

	public static void main(String[] args) {
		int count = 0;		
		int run = 1;
		int num = 9;
		
		int start = 50;
		int max = 100;
		int i = start;
		while(run == 1) {
			if(i % num == 0) { // 9의 배수
				//System.out.println(i);
				count = count + 1;
			}
			i += 1;
			if(i == max) {
				run = 0;
			}		
		}	
		System.out.print(count + " (");
		i = start;
		run = 1;
		count = 0;
		while(run == 1) {
			if(i % num == 0) {
				System.out.print(i);
				count += 1;
				if(count < 6) {
					System.out.print(",");
				}
			}		
			i += 1;
			if(i == max) {
				run = 0;
			}		
		}	
		System.out.println(")");

	}

}
