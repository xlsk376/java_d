package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_���� {

	public static void main(String[] args) {
		/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
		 */
		
		int i = 0;
		int n1 = 42;
		int n2 = 28;
		int max = 0;
		
		for(i = 1; i <=42; i++) {
			if(n1%i == 0 && n2%i == 0) {
				System.out.println(i);
				max = i;
			}
		}System.out.println(max);
		
		

	}

}
