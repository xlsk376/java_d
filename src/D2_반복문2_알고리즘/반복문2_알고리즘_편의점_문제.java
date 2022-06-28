package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_편의점_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
			철수가 편의점의 한개에 1000원인 흰우유와 한개에 1200원인 초코우유를 몇개 사서 
			총 15개의 우유를 샀다.
			20000원을 내고 4200원을 거슬러받았을때 철수가산 흰우유는 몇개인가요??
		 */	
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		
		int 총우유 = 15;
		int a = 총우유;
		int b= 0;
		
		int run = 1;
		while(run == 1) {
			if(white*a + choco*b == money && a + b == 15) {
				System.out.println(a + " " + b);
				run = 0;
			}
			a -= 1;
			b += 1;
		}
		
		

	}

}
