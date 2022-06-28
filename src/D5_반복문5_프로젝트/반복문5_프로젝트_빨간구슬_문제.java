package D5_반복문5_프로젝트;

public class 반복문5_프로젝트_빨간구슬_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		  
		    파란구술 50개와 빨간 구술 70개를 최대한 많은 학생들에게 똑같이 나누어줄려고한다.
			파란구슬은 5개가남고 빨간구슬은 2개가 부족할때, 다음물음에 답하여라.
			1) 학생수는 얼마인가요?
			2) 학생당 받게되는 빨간구슬의 개수를 구하여라 .
		 */
		
		int blue = 50;
		int red = 70;
		
		int i = 1;
		while(true) {
			if(blue % i == 5 && (red +2) % i == 0) { 
				System.out.println(i);				 //파란 5개남음 나머지가 5, 빨간 2개 부족 red개수에 +2 한 나머지가 0
				break;
			}
			i += 1;
		}
		System.out.println("학생수 : " + i);
		System.out.println(red / i + " 개");

	}

}
