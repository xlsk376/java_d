package D4_반복문4_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문4_프로젝트_369개수_정답 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//int r = ran.nextInt(10000) + 1;
		int r = scan.nextInt();
		int temp = r;
		int count = 0;
		while(true) {
			System.out.println(temp);
			int a = temp%10; // 자리수 출력
			if(a == 3 || a == 6 || a == 9) { // 해당 자리에 대해 3,6,9가 있으면 카운트
				count += 1;
			}
			temp = temp / 10; // 10으로 나눈값을 다시 저장해서 몫이 0이될때까지 진행
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count  + "개");
	}

	}


