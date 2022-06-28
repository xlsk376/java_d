package D5_반복문5_프로젝트;

public class 반복문5_프로젝트_학생수_문제 {

	public static void main(String[] args) {
		/*  
		  [문제]
			   a중학교 1학년 입학하는 학생들은 8줄 12줄 18줄로 세워도 항상 5명이 남을때,
			   1학년 전체 학생수를 구하여라.
			   (학생수는 200명이상 250명미만)
		 
		 */
		// 항상 5명이 남는다는 나머지가 5명이라는 얘기임
		//학생수는 200 <= student < 250 조건으로 200명부터 시작
		
//		int i = 0;
//		for(i=200; i < 250; i++) {
//			if(i%8 == 5 && i%12 == 5 && i%18 == 5) { //자신으로 나눠서 나눠떨어지면 자신의 배수
//				System.out.println(i);
//				
//			}
//		}
		
		int student = 200;
		while(true) {
			if(student%8 == 5 && student%12 == 5 && student%18 == 5) {
				System.out.println(student);
				break;
			}
			student += 1;
		}

	}

}
