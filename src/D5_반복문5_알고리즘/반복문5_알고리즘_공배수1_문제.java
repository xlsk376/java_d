package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제 {

	public static void main(String[] args) {
		/*
		  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
		 */
		int a = 12;
		int b = 15;
		int count = 0;
		
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) { // 무한 반복
			if(num1 < num2) {  // 12의 배수와 15의 배수의 크기와 순서가 같지 않기 때문에 비교하여 자신의 수를 더해간다.
				num1 += a; // num1에 자신과 같은 수+
			}else if(num2 < num1) {
				num2 += b;
			}else if(num1 == num2) { //더해가다가 12와 15의 배수의 크기가 같을경우 값을 출력
				System.out.println(num1);
				//i = 0; //무한 반복 해제
				num1 += a; // num1과 num2 비교시 작은수부터 다시 더해감
				count += 1; // 5개 출력이기때문에
			}
			if(count == 5) {// 5개 출력이기때문에 5번 출력후 멈춘다.
				break;
			}
		}
		
//		int a = 12;
//		int b = 15;
//		int count = 0;
//		int n1 = a;
//		int n2 = b;
//		int i = 1;
//		while(true) { // 모든 경우의 수를 다 계산하여 과부하걸림
//			if(i%a == 0 && i%b == 0) {
//				System.out.println(i);
//				count += 1;
//				if(count == 5) {
//					break;
//				}
//			}
//			i += 1;
//		}
		
		

	}

}
