package D3_반복문3_프로젝트;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제 {

	public static void main(String[] args) {
		/*
		 * [랜덤점수통계]
		 * 
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . [1] 전교생(10명)의 총점과 평균을 출력한다.
		 * . [2] 합격자 수를 출력한다.
		 * . [3] 1등 학생의 번호와 성적을 출력한다.
		 */
		
		Random ran = new Random();
		
//		int temp = 0;
//		int total = 0;
//		int i = 0;
//		for(i = 0; i < 10; i++) {
//			 int score = ran.nextInt(100)+1; // 1~100
//			 total = score + ;
//			 System.out.println("총합 : "+  total);
//			 System.out.println(score);
//			 
//		}System.out.println("총합 : "+  total);
		int total = 0;
		int count = 0;
		int num = 0;
		int maxScore = 0;
		for(int i = 1; i <= 10; i++) {
			int r = ran.nextInt(100)+1;
			if(r >= 60) { 
				System.out.println(i + "번 학생 합격 : " + r);// 해당 번호의 합격생수를 확인
				count += 1;
			}else {
				System.out.println(i + "번 학생불 합격 : " + r);// 해당 번호의 불합격생수를 확인
			}
			if(maxScore < r) { // 기존값과 비교해서 가장큰값 출력
				maxScore = r;
				num = i; // 1등학생이 나올때 최종 번호
			}
			total = total + r; // 총점합산
		}
		System.out.println("총점 : " + total + " 평균 : " + total/10.0);
		System.out.println("합격생수 : " + count);
		System.out.println("1등 : " + num + " 점수 : " + maxScore);

	}

}
