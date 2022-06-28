package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시 {

	public static void main(String[] args) {
		/*
		 * 
		 * [카카오 택시]
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 * 5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다.
		 */
		 Random ran = new Random();
		 Scanner scan = new Scanner(System.in);
		 
		 int dir = 0;
		 int x = 0;
		 int y = 0;
		 int dx = 0;
		 int dy = 0;
		 int speed = 0;
		 int money = 0;
		 int total = 0;
		 dx = ran.nextInt(21) - 10; // -10 ~ 10 => 21 // 목적지 지정
		 dy = ran.nextInt(21) - 10; // 목적지 지정
		 while(true) { // 종료전까지 무한 반복
			 System.out.println("[목적지] : x : " + dx + " y : " + dy);
			 System.out.println("[현재위치] : x : " + x + " y : " + y);
			 System.out.println("[방향] : " + dir + " [속도] : " + speed);
			 System.out.println("[현재요금] : " + money + " [전체수익] : "+ total);
			 System.out.println("[1.속도] [2.방향] [3.이동] [0.종료]");
			 int sel = scan.nextInt();
			 if(sel == 0) { //종료 버튼
				 break;
			 }else if(sel == 1) { //속도 입력
				 System.out.println("속도를 입력하세요 : ");
				 speed = scan.nextInt();
				 if(speed < 1 || speed > 3) {
					 speed = 1; // 1~3 외에 값을 입력시 기본 스피드1로 설정
				 }
			 }else if(sel == 2) { //방향 입력
				 System.out.println("방향을 입력하세요 [1.북][2.동][3.남][4.서]");
				 dir = scan.nextInt();
				 if(dir < 1 || dir > 3) {
					 dir = 1; // 1~4 외에 값을 입력시 기본 방향은 1로 설정
				 }
			 }else if(sel == 3) { //이동
				 if(dir == 1) {
					 y += speed;
				 }else if(dir == 2) {
					 x += speed;
				 }else if(dir == 3) {
					 y -= speed;
				 }else if(dir == 4) {
					 x -= speed;
				 }
				 money += speed;
			 }else {
				 System.out.println("오류");
			 }
			 
			 if(dx == x && dy == y) { //현재위치와 목적지가 같은 순간 
				 total += money;
				 money = 0; // 다음 이용자가 기존이용자에 + 된 금액 지불하기 때문에 0으로 초기화
				 dx = ran.nextInt(21) - 10; // -10 ~ 10 => 21
				 dy = ran.nextInt(21) - 10;
			 }
		 }

	}

}
