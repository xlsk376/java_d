package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
			ö���� �������� �Ѱ��� 1000���� ������� �Ѱ��� 1200���� ���ڿ����� � �缭 
			�� 15���� ������ ���.
			20000���� ���� 4200���� �Ž����޾����� ö������ ������� ��ΰ���??
		 */	
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		
		int �ѿ��� = 15;
		int a = �ѿ���;
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
