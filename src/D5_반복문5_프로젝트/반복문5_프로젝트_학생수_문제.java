package D5_�ݺ���5_������Ʈ;

public class �ݺ���5_������Ʈ_�л���_���� {

	public static void main(String[] args) {
		/*  
		  [����]
			   a���б� 1�г� �����ϴ� �л����� 8�� 12�� 18�ٷ� ������ �׻� 5���� ������,
			   1�г� ��ü �л����� ���Ͽ���.
			   (�л����� 200���̻� 250��̸�)
		 
		 */
		// �׻� 5���� ���´ٴ� �������� 5���̶�� �����
		//�л����� 200 <= student < 250 �������� 200����� ����
		
//		int i = 0;
//		for(i=200; i < 250; i++) {
//			if(i%8 == 5 && i%12 == 5 && i%18 == 5) { //�ڽ����� ������ ������������ �ڽ��� ���
//				System.out.println(i);
//				
//			}
//		}
		
		int student = 200;
		while(true) {
			if(student%8 == 5 && student%12 == 5 && student%18 == 5) {
				System.out.println(student);
				break;
			}
			student += 1;
		}

	}

}
