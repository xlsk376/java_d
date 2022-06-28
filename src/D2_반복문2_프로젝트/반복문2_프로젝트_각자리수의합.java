package D2_반복문2_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문2_프로젝트_각자리수의합 {

	public static void main(String[] args) {
		/*
		 * [문제]
			 1~999 사이의 랜덤숫자를 저장하고 각 자리수의 합을 출력하시오.
			 예) 8 ==> 8
			 예) 28 ==> 2 + 8
			 예) 999 ==> 9 + 9 + 9
		 */
		
//		Random ran = new Random();
//		int num = ran.nextInt(999)+1; // 1~999
//		System.out.println(num);
//		int n100 = num/100;
//		int n10 = num%100/10;
//		int n1 = num%100%10;
////		System.out.println(n100);
////		System.out.println(n10);
////		System.out.println(n1);
//		
//		int run = 1;
//		while(run == 1) {
//			if(num <= 999 && num >= 100) {
//				//System.out.println(num);
//				num = n100 + n10 + n1;
//				System.out.println(num);
//			}else if(num <= 99 && num >=10) {
//				//System.out.println(num);
//				num = n10 + n1;
//				System.out.println(num);
//			}else if(num <= 9 && num >=1) {
//				System.out.println(num);
//			}
//			run = 0;
//			
//		}
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//int num = ran.nextInt(999)+1;
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		int i = 0;
		int a = 0;
		
		int run = 1;
		while(run == 1) { // 10으로 나눈 나머지는 무조건 1의 자리
						  // 반복적으로 10으로 나머지가 0이 될때까지 나눈다.
			a = temp%10; // 자리수 계산, 나눈 나머지가 자리수가 됨
			sum = sum + a; // 자리수의 합
			temp = temp/10; //나눈후 나눈값을 다시 저장 예) 111/10 = 11 // 111은 초기값 11은 나눈후 저장한 값
			if(temp == 0) { // 안나눠질경우 탈출!
				run = 0;
			}
		
			i += 1;

		}
		System.out.println(sum);
		

	}

}
