package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_베스킨라빈스31 {

	public static void main(String[] args) {
		/*
		 * [베스킨라빈스31]
		 *   베스킨라빈스 게임이란, 플레이어 2명이 번갈아가면서
		 *   1~3사이의 숫자를 선택할수있고, 그숫자들을 계속 더해서 
		 *   그누적합이 31에 먼저도달한쪽이 지는게임이다.
		 * 
		 * 
		 * 1) 각 플레이어는 번갈아가면서 1~3을 선택한다.
		 * 2) 만약에 이상한숫자를 입력하면 1~3을 입력할때까지 계속자기 차례이다.
		 * 3) 각 플레이어가 선택한숫자는  total  변수에 계속 누적해서 더한다.
		 * 4) total 이 31이상에 도달하면 승리자를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		int player = 0;
//
//		int a = 0;
//		int b = 0;
//		int temp = 0;
//		int total = 0;
//		
//		boolean run = true;
//		while(run) {
//			System.out.println("숫자1 : ");
//			player = scan.nextInt();
//			if(player < 1 || player > 3) {
//				System.out.println("다시입력하세요.");
//				
//			}else {
//				total = total + player;
//				System.out.println(total);
//				System.out.println("숫자2 : ");
//				player = scan.nextInt();
//				if(player < 1 || player > 3) {
//					System.out.println("다시입력하세요.");
//				}else {
//					total = total + player;
//				}
//				System.out.println(total);
//			}
//
//		}
		int p1 = 0;
		int p2 = 0;
		int total = 0;
		int turn = 1; // 플레이어 턴
		while(true) {
			System.out.println("베스킨라빈스 : " + total);
			if(turn % 2 == 1) { //1번 플레이어 턴일 경우, 턴 홀수
				System.out.println("[p1] 1~3을 입력하세요 : ");
				int me =scan.nextInt();
				if(me < 1 || me > 3) { // 잘못입력시 현재 턴에서 재입력 
					System.out.println("잘못입력하였습니다.");
				}else {
					total += me; //입력하였다면 1~3값 들어감
					turn += 1; // 턴을 넘기기 위해 +1
				}
			}else if(turn % 2 == 0) { //2번 플레이어 턴일 경우, 턴 짝수
				System.out.println("[p2] 1~3을 입력하세요 : ");
				int me = scan.nextInt();
				if(me < 1 || me > 3) {
					System.out.println("잘못입력하였습니다.");
				}else {
					total += me;
					turn += 1; // 턴을 넘기기 위해 +1
				}
			}
			if(total >= 31) { //31이상 도달이면 승리자 출력
				break;
			}
		}
		if(turn%2 == 1) { //해당턴을 확인하여 승리자 체크
			System.out.println("p1승리");
		}else {
			System.out.println("p2승리");
		}

	}

}
