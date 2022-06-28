package D3_반복문3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_알고리즘_업다운게임_문제 {

	public static void main(String[] args) {
		/*
		 *  [Up & Down 게임]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , 
		 * 	  com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			int com = ran.nextInt(100)+1;
			System.out.println(com);
			while(true) {
				System.out.print("숫자를 입력하세요(1~100) : ");
				int me = scan.nextInt();
				if(com > me) {
					System.out.println("크다");
					me = 0;
				}else if(com < me) {
					System.out.println("작다");
					me = 0;
				}else if(com == me) {
					System.out.println("정답");
					break;
				}
				
			}
			break;
		}
		
		
//		while(true) {
//			System.out.println("=== 업다운 게임 ===");
//			int com = ran.nextInt(100) + 1;		
//			while(true) {
//				System.out.println("1~100을 입력하세요 : ");
//				int me = scan.nextInt();
//				if(me == -1000) {
//					System.out.println("치트키 : " + com);
//				}
//				else if(me < com) {
//					System.out.println("정답은 크다.");
//				}
//				else if(me > com) {
//					System.out.println("정답은 작다.");
//				}
//				if(me == com) {
//					System.out.println("정답.");
//					break;
//				}		
//			}
//			System.out.println("계속합니까? yes(1) , no(2) ");
//			int con = scan.nextInt();
//			if(con == 2) {
//				System.out.println("종료.");
//				break;
//			}
//		}
		
		
		

	}

}
