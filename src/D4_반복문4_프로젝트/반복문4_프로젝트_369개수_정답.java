package D4_�ݺ���4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���4_������Ʈ_369����_���� {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//int r = ran.nextInt(10000) + 1;
		int r = scan.nextInt();
		int temp = r;
		int count = 0;
		while(true) {
			System.out.println(temp);
			int a = temp%10; // �ڸ��� ���
			if(a == 3 || a == 6 || a == 9) { // �ش� �ڸ��� ���� 3,6,9�� ������ ī��Ʈ
				count += 1;
			}
			temp = temp / 10; // 10���� �������� �ٽ� �����ؼ� ���� 0�̵ɶ����� ����
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count  + "��");
	}

	}


