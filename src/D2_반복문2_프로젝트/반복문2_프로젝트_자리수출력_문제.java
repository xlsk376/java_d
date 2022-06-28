package D2_반복문2_프로젝트;

import java.util.Random;

public class 반복문2_프로젝트_자리수출력_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
			 [1] 1~99999 사이의 랜덤숫자를 저장하고 자리수가 몇자리인지 출력하고,
			 [2] 그중에 9의 개수를 출력.
			 
			 예) 8 ==> 1 , 0
			 예) 102 ==> 3 , 0
			 예) 88 ==> 2 , 0
			 예) 919 ==> 3, 2
		 */
		
//		Random ran = new Random();
//		int num = ran.nextInt(99999)+1;
//		int 자리수 = 0;
//		int 개수 = 0;
//		int temp = num;
//		int n10000 = num/10000;
//		int n1000 = num%10000/1000;
//		int n100 = num%10000%1000/100;
//		int n10 = num%10000%1000%100/10;
//		int n1 = num%10000%1000%100%10;
//		
//		boolean run = true;
//		while(run == true) {
//			temp = temp /10; // 자리수 출력이므로 십의자리로 나눈뒤 카운트가 자리수
//			자리수 += 1;
//			if(n10000 == 9 || n1000 == 9 || n100 == 9 || n10 == 9 || n1 == 9) {
//				개수 += 1;
//			}
//			
//			
//			
//			if(temp == 0) {
//				run = false;
//			}
//			
//			//자리수 += 1;
//		}
//		System.out.println(num + " " + 자리수 + " " + 개수);
//		System.out.println(n10000);
//		System.out.println(n1000);
//		System.out.println(n100);
//		System.out.println(n10);
//		System.out.println(n1);
		
		
		Random ran = new Random();
		int r = ran.nextInt(99999)+1;
		//System.out.println(r);
		int temp = r;
		int count = 0;
		int a = 0;
		int 자리수 = 0;
		while(true) {
			//System.out.println(temp);
			a = temp%10;
			if(a == 9) {
				count += 1;
			}
			temp = temp/10;
			자리수 += 1;
			if(temp == 0) { // 나눈값이 0이 되면 제일 큰수의 자리수를 출력못하고 빠져나옴
				break;		// 더이상 나눌께 없을경우에 빠져나와야 총 자리수를 출력하고 끝남
			}
		}
		
		System.out.println(r + " ==> " + 자리수 + " , "+count);

	}

}
