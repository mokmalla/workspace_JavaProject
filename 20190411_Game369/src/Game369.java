//1~99����
//���ڿ� 3, 6, 9�� ������ ¦�� ���
//�ƴϸ� ���ڸ� ����Ѵ�
public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<=99;i++) {
			//���� -> ���ڿ�
			String numberString =  String.valueOf(i);
			//�ϳ��� ���� '3' �Ǵ� '6' �Ǵ� '9'�� ������ ����
			int count = count369(numberString);
			if (count ==0){
				//������ 0�̸� �׳� �������
				System.out.println(i);
			}else {
				//�ƴϸ�,
				for(int j=0; j<count; j++) {
					//������� '¦'���
					System.out.print("¦");
				}
				System.out.println();
			}	
	}
}
	private static int count369(String numberString) {
		int sum =0;
		//0~length-1 ����
		//���ڸ� �ϳ��� ���ϰ�
		//�� ���ڰ� '3' �Ǵ� '6' �Ǵ� '9'�̸� ¦
		for(int i =0; i<numberString.length();i++) {
		char ch= numberString.charAt(i);	
		if(ch == '3' || ch == '6'|| ch =='9') {
			sum++;
		}
		}
		return sum;
	}
}
