package D3_반복문3_알고리즘;

import java.util.Scanner;

public class 반복문3_알고리즘_소수찾기_문제 {

	public static void main(String[] args) {
		/*
		 * 	[소수찾기]
		 * 
		 *  정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
		 *  소수란, 1과 자기자신으로만 나눠지는 수
		 *  예) 2, 3, 5, 7, 11, 13, ..
		 
			
		 * (1) 해당 숫자를 1부터 자기자신까지 나눈다.
		 * (2) 나머지가 0일 때마다 카운트를 센다.
		 * (3) 그 카운트 값이 2이면 소수이다.
		 * (4) 6/1 6/2 6/3 6/4 6/5 6/6	==> count=4	==> (소수x)
		 * (4) 2/1 2/2 	==> count=2	==>(소수)
		 * 
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int count = 0;
		int i = 1;
		while(i <= num) { // 자기자신까지 나눠서 확인, 약수구하기와 비슷
		//	System.out.println(i);
			if(num % i == 0) {
				count += 1;
			}
			i += 1;
		}
		if(count == 2) {
			System.out.println(num +"는 소수입니다.");
		}else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		

	}

}
