package D6_�ݺ���6_�⺻�̷�;

public class �ݺ���6_��Ÿ�̷�2_switch2 {

	public static void main(String[] args) {
		/*
		 * 	����ġ ���̽� (switch case)
		 *  ��뿹 : �񱳴���� ���� ==(����) �϶��� ��밡���ϴ�.
		 *  ����� ���� �����ϴ�. (if�� ����ص� �����ϴ�.)
		 *  
		 *  [1] default ==> if���� else�� ������Ȱ���Ѵ�.
		 */	
		
		int a = 4;			
		//----------------------------------
		if(a == 1) {
			System.out.println("a �� 1�̴�");
		}else if(a == 2) {
			System.out.println("a �� 2�̴�");
		}else if(a == 3) {
			System.out.println("a �� 3�̴�");
		}else {
			System.out.println("1~3�� �ƴϴ�.");
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
		default :
			System.out.println("1~3�� �ƴϴ�.");
		}
		
		

	}

}
