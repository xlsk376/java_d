package D4_반복문4_알고리즘;

import java.util.Random;

public class 반복문4_알고리즘_가장큰수번호_문제 {

	public static void main(String[] args) {
		/*
		 * [문제1] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 1) 랜덤숫자중 가장큰수와 번호를 출력 (번호는 출력순서이다.) 2)
		 * 가장큰수가 여러개있다면 가장첫번째 번호를 출력 예) 1, 7, 4, 7, 5 ==> 가장큰수 : 7 , 번호 : 2 가장큰수가 2개지만
		 * 첫번째번호를 출력
		 * 
		 * [문제2] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 1) 랜덤숫자중 가장큰수와 번호를 출력 (번호는 출력순서이다.) 2)
		 * 가장큰수가 여러개있다면 가장마지막 번호를 출력 예) 1, 7, 4, 7, 5 ==> 가장큰수 : 7 , 번호 : 4 가장큰수가 2개지만
		 * 마지막 번호를 출력
		 */

		Random ran = new Random();

		// int count = 0; // 큰수비교 카운트를 체크한것임 필요없음 잘못작성
//		 int i = 1;
//		 int num = 0;
//		 int max = 0;
//		 //int r = 0;
//		 while(i <=9) {
//			 r = ran.nextInt(9)+1; 
//			 System.out.println(r);
//			 if(max < r) {
//				 max = r;
//				 //count += 1; // 큰수비교 카운트를 체크한것임 필요없음 잘못작성
//				 //System.out.println("큰수 : " + max + " 번호 : " + i);
//				 num = i;
//			 }
//			 //System.out.println(r);
//			 i += 1;
//		 }
//		 //System.out.println("가장큰수 : " +max + " 번호 : " /*+ count*/);
//		 System.out.println("가장큰수 : " +max + " 번호 : " + num);

		System.out.println("--------------------------------");
		System.out.println();

//		 i = 1;
//		 num = 0;
//		 max = 0;
//		 while(i <= 9) {
//			 int r = ran.nextInt(9)+1;
//			 //System.out.println(r);
//			 if(max < r) {
//				 max = r;
//				 System.out.println(max);
//			 }
//			 System.out.println(r);
//			 i += 1;
//		 }

		int i = 1;
		int max = 0;
		int number = 0;
		while (i <= 9) {
			int r = ran.nextInt(9) + 1;
			if (max <= r) {
				max = r;
				number = i;

			}
			System.out.println(r);
			i += 1;
		}
		System.out.println("맥스 : " + max + " 번호 : " + number);
		
		// ↓ 재구성해봄
//		for(i = 1; i <= 5; i++) {
//			int num = ran.nextInt(9)+1;
//			System.out.println(num); 
//			if(max < num) {
//				max = num;
//				//count = i;
//			}
//			if(max == num) { // max값이 랜덤값과 같을때 반복된 i를 count에 집어넣는다.
//				count = i;
//			}
//			
//		}
//		System.out.println("가장 큰 수 : " + max + ", " + "번호 : "+ count);

	}

}
