package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_369개수_문제 {

	public static void main(String[] args) {
		/*
		 * [369게임]
		  
			  1~ 10000 사이의 숫자를 입력받고 
			  3이나 6이나 9의  개수출력하시오.
		 
			  예) 9999 ==> 4
			  예) 36 ==> 2
			  예) 1 ==> 0
			  예) 222 ==> 0  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int temp = num;
		while(true) {
			System.out.println(temp);
			temp = temp%10;
			
			
		}
		/*
		 * [369게임]
		  
			  1~ 10000 사이의 숫자를 입력받고 
			  3이나 6이나 9의  개수출력하시오.
		 
			  예) 9999 ==> 4
			  예) 36 ==> 2
			  예) 1 ==> 0
			  예) 222 ==> 0  
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요(1~10000)");
//		int num = scan.nextInt();
//		int temp = num;
//		int i = 0;
//		int a = 0;
//		int count = 0;
//		while(true) {
//			a = temp%10;
//			//System.out.println(a); // 자리수 출력
//			if(a == 3 || a == 6 || a== 9) {
//				count += 1;
//			}
//			temp = temp/10; // 10으로 나눈 값을 다시 저장
//			if(temp == 0) { // 더이상 나눌것이 없으면 종료
//				break;
//			}
//		}
//		System.out.println(num + " ==> " + count);

	}

}
