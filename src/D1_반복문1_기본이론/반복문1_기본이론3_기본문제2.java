package D1_반복문1_기본이론;

public class 반복문1_기본이론3_기본문제2 {

	public static void main(String[] args) {
		// [문제] 1~5까지의 합을 출력하시오.
		
		int i = 1;
		int total = 0;
		while(i <= 5) {
			total = total + i;
			i += 1;
			
		}
		System.out.println(total);

	}

}
