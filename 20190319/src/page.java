import java.util.Scanner;

public class page {
public static void main(String[] args) {
	int nPerPage=7;
	Scanner scanner = new Scanner(System.in);
	int ���;
	while(true){
	System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ���ÿ�.)");
	 String inputString = scanner.nextLine();
	 
	 if(inputString.equals("exit") ) {
	 System.out.println("��");
	 break;
	}
	 int result = Integer.parseInt(inputString); //int�� �ٲٱ� 
	 ��� = result / nPerPage;
	if(result%nPerPage !=0) {
		��� = result / nPerPage+1;
	}
	
	
	System.out.println(���+"�������� �ʿ��մϴ�.");
	}
}
}
