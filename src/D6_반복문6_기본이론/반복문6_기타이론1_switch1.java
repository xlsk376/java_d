package D6_�ݺ���6_�⺻�̷�;

public class �ݺ���6_��Ÿ�̷�1_switch1 {

	public static void main(String[] args) {
		/*
		 * 	����ġ ���̽� (switch case)
		 *  ��뿹 : �񱳴���� ���� ==(����) �϶��� ��밡���ϴ�.
		 *  ����� ���� �����ϴ�. (if�� ����ص� �����ϴ�.)
		 *  
		 * 1) switch    ==> Ű����
		 * 2) (��)       ==> ���Ұ� 
		 * 3) {}    	==> ���� 
		 * 4) case ��:   ==> ���Ұ� 
		 * 5)  ����  break ==> ���Ұ��� ���� 
		 */	
		
		int a = 2;			
		//----------------------------------
		if(a == 1) {
			System.out.println("a �� 1�̴�");
		}else if(a == 2) {
			System.out.println("a �� 2�̴�");
		}else if(a == 3) {
			System.out.println("a �� 3�̴�");
		}		
		//----------------------------------
		switch(a) {
		case 1:
			System.out.println("a �� 1�̴�");
			break;
		case 2:
			System.out.println("a �� 2�̴�");
			break;
		case 3:
			System.out.println("a �� 3�̴�");
			break;
		}

	}

}
