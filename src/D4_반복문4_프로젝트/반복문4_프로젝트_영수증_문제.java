package D4_반복문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증_문제 {

	public static void main(String[] args) {
		/*
		 * 
		 * [영수증 출력]
		 * 1. 5번 주문을 받는다.
		 * 2. 주문이 끝난 후, 돈을 입력받는다.
		 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */
		Scanner scan = new Scanner(System.in);
		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		int c1 = 0;
//		int c2 = 0;
//		int c3 = 0;
//		
////		System.out.println("=== 롯데리아 ===");
////		System.out.println("1.불고기 버거 : " + price1 + "원");
////		System.out.println("2.새우    버거 : " + price2 + "원");
////		System.out.println("3.콜         라 : " + price3 + "원");
//		
//		for(int i = 1; i < 5; i++) {
//			System.out.println("=== 롯데리아 ===");
//			System.out.println("1.불고기 버거 : " + price1 + "원");
//			System.out.println("2.새우    버거 : " + price2 + "원");
//			System.out.println("3.콜         라 : " + price3 + "원");
//			int sel = scan.nextInt();
//			if(sel == 1) {
//				c1 += 1;
//			}else if(sel == 2) {
//				c2 += 1;
//			}else if(sel == 3) {
//				c3 += 1;
//			}else {
//				System.out.println("오류");
//				System.out.println("다시입력하세요.");
//				i = 0;
//			}
//			
//			int sum = c1*price1 + c2*price2 + c3*price3;
//			System.out.println("메뉴선택 : " + sel);
//			System.out.println("메뉴선택 : " + sel);
//			System.out.println("메뉴선택 : " + sel);
//			System.out.println("메뉴선택 : " + sel);
//			System.out.println("메뉴선택 : " + sel);
//			System.out.println("총금액 : " + sum);
//			System.out.println("현금 입력 : " );
//			int cash = scan.nextInt();
//			
//			System.out.println("=== 롯데리아 영수증 ===");
//			System.out.println("1. 불고기 버거 : " + c1);
//			System.out.println("2. 새우  버거 : " + c2);
//			System.out.println("3. 콜     라 : " + c3);
//			System.out.println("4. 총  금  액 : " + sum);
//			System.out.println("5. 잔     돈 : " + (cash - sum));
//			
//		}
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기버거 : " + price1 + "원");
			System.out.println("2.새우버거 : " + price2 + "원");
			System.out.println("3.콜라 : " + price3 + "원");
			int sel = scan.nextInt();		
			if(sel == 1) {
				c1 += 1;
			}else if(sel == 2) {
				c2 += 1;
			}else if(sel == 3) {
				c3 += 1;
			}else {
				System.out.println("오류"); // 전에 진행한 횟수 클리어
				i = i - 1;				   // 2번째에서 틀렸으면 다시 2번째부터 시작
			}
		}
	//	System.out.println(c1 + " " + c2 + " " + c3);
		System.out.println("=== 롯데리아 영수증===");
		System.out.println("1.불고기버거 : " + price1 * c1 + "원 " + c1 + "개");
		System.out.println("2.새우버거 : " + price2 * c2+ "원 "  + c2 + "개");
		System.out.println("3.콜라 : " + price3 * c3+ "원 "  + c3+ "개");
	
		
		// ↓ 재작성
//		Scanner scan = new Scanner(System.in);
//		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		int count = 0;
//		int cash = 0;
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		System.out.println("=== 롯데리아 ===");
//		System.out.println("1.불고기 버거 : " + price1 + "원");
//		System.out.println("2.새우    버거 : " + price2 + "원");
//		System.out.println("3.콜         라 : " + price3 + "원");
//		
//	    for(int i = 1; i <= 5; i++) { // 다섯번 주문
//	    	System.out.print("메뉴를 선택하세요.");
//	    	int sel = scan.nextInt(); // 메뉴선택
//	    	
//	    	if(sel == 1) { // 불고기 버거
//	    		a += 1;
//	    		
//	    	}else if(sel == 2) {//새우버거
//	    		b += 1;
//	    		
//	    	}else if(sel == 3) { // 콜라
//	    		c += 1;
//	    		
//	    	}else {
//	    		System.out.println("다시입력하세요");
//	    		i -= 1; // 전에 진행한 횟수를 다시 초기화
//	    				// 2번째에서 틀렸으면 2번째부터 다시주문
//	    	}
//	    	
//	    }
//	    System.out.println("금액을 넣으세요");
//	    cash = scan.nextInt();
//	    int sum = a*price1 + b*price2 + c* price3;
//	    if(cash >= sum) {
//	    	System.out.println("1.불고기 버거 : " + a);
//		    System.out.println("2.새우  버거 : " + b);
//		    System.out.println("3.콜     라 : " + c);
//		    System.out.println("4.총  금  액 : " + sum);
//		    System.out.println("5.잔     돈 : " + (cash - sum));
//	    }else if(cash < sum){
//	    	System.out.println("금액을 다시 입력하세요.");
//	    }

	}

}
