package D3_반복문3_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_프로젝트_랜덤구구단게임_문제 {

	public static void main(String[] args) {
		/*
		 *  [랜덤구구단 게임] (반복문사용)
		 * 1. 랜덤구구단 게임을 10회 반복한다.
		 * 2. 정답을 맞추면 1문제당 10점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 * 4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int i = 0;
		int combo = 0;
		for(i=0; i < 10; i++) {
			int a = ran.nextInt(8)+ 2; //2~9
			int b = ran.nextInt(9)+ 1; //1~9
			int c = a * b;
			System.out.printf("%d * %d = ", a, b);
			//System.out.printf("%d번째 문제, %d X %d = ? :", i, num1, num2);
			int me = scan.nextInt();
			if(me == c) {
				System.out.println("정답");
				count += 1;
				combo = 0; // 정답을 맞출경우 오답의 카운터를 0으로 해준다.
						   // 오답2 + 정답일경우 연속오답이 아니기때문에 해준다.
			}else {
				combo += 1;
				System.out.println("오답");
			}
			if(combo == 3) {
				System.out.println("연속으로 3번 실패");
				count = 0;
				break;
			}
		}
		System.out.println(count * 10 + "점");

	}

}
