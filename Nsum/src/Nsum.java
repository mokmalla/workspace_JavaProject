import java.util.Scanner;

public class Nsum {
  public static void main(String[] args) {
	//���� String���� �Է� ���� <= �ڸ����� �˱� ���ؼ� <= 0~�ڸ��� -1���� �ϳ��� �߶� ���ؾ���
	  Scanner sc=new Scanner(System.in);
	  String number= sc.nextLine();
	  nSum(number);
	  
}

private static void nSum(String number) {
	//�� �ڸ����� ���� ������
	  int length = number.length();
	  int sum = 0;
	  for(int i=0; i< length; i++) {
	  //0~�ڸ��� -1���� �ݺ�����
	  // �ѱ��ھ� �����ͼ� ���ڷ� �ٲ���
		  char n = number.charAt(i);
		
		  sum+=n - '0';
	  //sum�� ������
	  //���� ���� �������
	  }
	  System.out.println(sum);
}
}
