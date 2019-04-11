import java.util.Scanner;

public class StudentNumber2major {
	public static void main(String[] args) {
		//학번 입력하자
		//학과 출력하자
		// 학년이 1,2이면
		// 반이 3, 4이면"뉴미디어웹솔루션과"
		//학년이 3이면
		//반이 3,4면 "뉴미디어디자인과"
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("학번 입력");
			String n = sc.nextLine();
			System.out.println(n);
			
			String grade = n.substring(0, 1);
			//char grade = n.charAt(0);
			String classroom = n.substring(1,2);
			char gradeCh = n.charAt(0);
			char classroomCh = n.charAt(1);
			
			if(grade.equals("1") || grade.equals("2")) {
				//학년이 1,2 이면
				if(classroom.equals("1")|| classroom.equals("2"))
					System.out.println("뉴미디어소프트웨어과");
			
			else if(classroom.equals("3")|| classroom.equals("4"))
				System.out.println("뉴미디어웹솔루션과");
	
			else if(classroom.equals("5")|| classroom.equals("6"))
					System.out.println("뉴미디어디자인과");
		
		} else if(gradeCh == '3') {
			switch(classroomCh) {
			case '1' : 
			case '2' : System.out.println("인터랙티브미디어과"); break;
			case '3' : 
			case '4' : System.out.println("뉴미디어디자인과"); break;
			case '5' : 
			case '6' : System.out.println("뉴미디어웹솔루션과"); break;
			}
		}
		}
	}
}
