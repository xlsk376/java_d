package D3_반복문3_프로젝트;

import java.util.Scanner;

public class 반복문3_프로젝트_반복문로그인_문제 {

	public static void main(String[] args) {
		/*
		 * 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 
		 * 2. 로그아웃 . 로그인 후 이용가능
		 * 3. 로그인,로그아웃 관리는 log 변수를 이용한다.
		 *  [예] -1(로그아웃), 1111(id1), 2222(id2)
		 */
		// 로그인 
		// 로그아웃 
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)
		// 해당하는 ID로 로그인 되어있는지 확인

		boolean run = true;
		while (run == true) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log == -1) {// 로그인이 안된상태 현재 : 로그아웃
					System.out.println("ID : ");
					int id = scan.nextInt();
					System.out.println("PW : ");
					int pw = scan.nextInt();
					if(id == id1 && pw == pw1) {
						log = id1; // 현재 id1이 로그인한 상태 log값에는 id1이 저장
					}else if(id == id2 && pw == pw2) {
						log = id2; //id1이 아니라면 id2값이 log에 저장
					}
					System.out.println(log + "님 로그인성공");
				}else {
					System.out.println("로그아웃이후 이용가능");//로그인 상태이기 때문에 로그아웃후 사용해야함
				}
			} else if (sel == 2) {
				if(log != -1) { //로그아웃후 로그아웃상태가 아니라면 log값을 로그아웃상태로 변경
					log = -1;
				}else { // 로그아웃상태라면 로그인을 하라는 문구뜸
					System.out.println("로그인을 하세요.");
				}
			} else if (sel == 0) { 
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		

	}

}
