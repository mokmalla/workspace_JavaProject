import java.util.Scanner;

public class NumberToWeekday {
 public static void main(String[] args) {
	 String[] weekdays = {"��","ȭ","��","��","��","��"};
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); 
	System.out.println(weekdays[n-1]+"����");
	/*switch(n) {
	case 1: System.out.println("������"); break;
	case 2: System.out.println("ȭ����"); break;
	case 3: System.out.println("������"); break;
	case 4: System.out.println("�����"); break;
	case 5: System.out.println("�ݿ���"); break;
	case 6: System.out.println("�����"); break;
	case 7: System.out.println("�Ͽ���"); break;
	}*/
	
}
}
