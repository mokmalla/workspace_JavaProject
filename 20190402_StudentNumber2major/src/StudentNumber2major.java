import java.util.Scanner;

public class StudentNumber2major {
	public static void main(String[] args) {
		//�й� �Է�����
		//�а� �������
		// �г��� 1,2�̸�
		// ���� 3, 4�̸�"���̵�����ַ�ǰ�"
		//�г��� 3�̸�
		//���� 3,4�� "���̵������ΰ�"
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("�й� �Է�");
			String n = sc.nextLine();
			System.out.println(n);
			
			String grade = n.substring(0, 1);
			//char grade = n.charAt(0);
			String classroom = n.substring(1,2);
			char gradeCh = n.charAt(0);
			char classroomCh = n.charAt(1);
			
			if(grade.equals("1") || grade.equals("2")) {
				//�г��� 1,2 �̸�
				if(classroom.equals("1")|| classroom.equals("2"))
					System.out.println("���̵�����Ʈ�����");
			
			else if(classroom.equals("3")|| classroom.equals("4"))
				System.out.println("���̵�����ַ�ǰ�");
	
			else if(classroom.equals("5")|| classroom.equals("6"))
					System.out.println("���̵������ΰ�");
		
		} else if(gradeCh == '3') {
			switch(classroomCh) {
			case '1' : 
			case '2' : System.out.println("���ͷ�Ƽ��̵���"); break;
			case '3' : 
			case '4' : System.out.println("���̵������ΰ�"); break;
			case '5' : 
			case '6' : System.out.println("���̵�����ַ�ǰ�"); break;
			}
		}
		}
	}
}
