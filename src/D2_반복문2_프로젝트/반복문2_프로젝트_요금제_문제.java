package D2_�ݺ���2_������Ʈ;

public class �ݺ���2_������Ʈ_�����_���� {

	public static void main(String[] args) {
		/*
		 * [����]
			  �Ʒ��Ͱ��� �޴������� �ִ� 
			  B�� �����Ұ�� A���� �� �������̵ɷ���,
			  ��ȭ�ð��� �󸶱��� ����ؾߵɱ��? 
			  ������ �ʷ� ���Ͻÿ�.
			  A����� �⺻��� 17500�� �ʴ� 5�� 
			  B����� �⺻��� 31000�� �ʴ� 2��
		  
		 */
		
		int am = 17500;
		int bm = 31000;
		
		int as = 5;
		int bs = 2;
		
		int t = 1; // �����ð�

		int run = 1;
		while(run == 1) {
			if(as*t + am > bs*t+bm ) { // A����� �� �������� ����
				System.out.println(t+ "��");
				run = 0;
			}
			t += 1;
			
		}
		System.out.println();
		System.out.println(t/3600 + "�ð�");
		System.out.println(t%3600/60 + "��");
		System.out.println(t%3600%60 + "��");
		System.out.println();
		System.out.println(4501*bs+bm);
		System.out.println(4501*as+am);
		
		/*
		 * int ���� = 31000-17500;
		int t = 0;
			
		while(t>=0) {
			t = t + 1;
			if(t*3>����) {
				System.out.println(t + "��");
			    t = -1;
			}
        }
		
		System.out.println(���� + "��");
		System.out.println(4501*3);
		
		���װ� �����ݾ��� ���Ͽ� Ȯ��
		 */
		

	}

}
