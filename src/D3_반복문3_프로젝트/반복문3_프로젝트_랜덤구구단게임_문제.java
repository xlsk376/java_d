package D3_�ݺ���3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_���� {

	public static void main(String[] args) {
		/*
		 *  [���������� ����] (�ݺ������)
		 * 1. ���������� ������ 10ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 1������ 10���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 * 4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
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
			//System.out.printf("%d��° ����, %d X %d = ? :", i, num1, num2);
			int me = scan.nextInt();
			if(me == c) {
				System.out.println("����");
				count += 1;
				combo = 0; // ������ ������ ������ ī���͸� 0���� ���ش�.
						   // ����2 + �����ϰ�� ���ӿ����� �ƴϱ⶧���� ���ش�.
			}else {
				combo += 1;
				System.out.println("����");
			}
			if(combo == 3) {
				System.out.println("�������� 3�� ����");
				count = 0;
				break;
			}
		}
		System.out.println(count * 10 + "��");

	}

}
