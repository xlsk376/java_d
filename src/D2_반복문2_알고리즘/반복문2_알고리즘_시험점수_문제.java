package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_��������_���� {

	public static void main(String[] args) {
		/*
	       [����]
		        ö���� �ι��� ���迡�� ���� 80���� 72���� �޾Ҵ�.
		        �� ��° ���迡�� �ּ� �� ���̻��� �޾ƾ� 
		        
		        ������ ���輺���� ����� 82���̻��� �ɼ� ������?

		*/
		
		int a = 80;
		int b = 72;
		int c = 0;
		int run = 1;
		while(run == 1) {
			if((a + b + c)/3 >= 82 && (a + b + c)/3 <= 100) {
				
				System.out.println(c);
				run = 0;
			}
			c += 1;
		}
		
		
		

	}

}
