package D6_�ݺ���6_�⺻�̷�;

public class �ݺ���6_��Ÿ�̷�3_���������� {

	public static void main(String[] args) {
		/*
		 * 	[����������]
		 * 	
		 *   [1] ++a    
		 *   	���� a�� 1�� �������� ��µȴ�.
		 *   
		 *   [2] a++
		 *   	a�� ��µǰ��� 1�̴�������. 
		 * 	
		 * 		
				 ������ �켱������ ���ؼ� 
				 ++�� ���� �ڿ� ���̴°� �켱������ ���峷�Ƽ� b�� ���� ��µǰ��� ���ϱ� 1�̵ȴ�. 
				 �̷����̿��ؼ� �ڵ带 �����������ϼ���������, ���������ʴ´�. 
				 ��Ȯ�� �ڵ��ϴ°� �� ����. 
		 */
		
		int a = 10;
		System.out.println("a : " + ++a);
		System.out.println("a : " + a);
		
		int b = 10;
		System.out.println("b : " + b++);	
		System.out.println("b : " + b);
		
		//�� ����麸�ٴ� �Ʒ������ �ڵ尡 ���ٴ����� �ξ� �������̴�. 
		int c = 10;
		System.out.println(c);
		c += 1;
		System.out.println(c);

	}

}
