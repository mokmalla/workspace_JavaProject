import java.util.Scanner;

public class page {
public static void main(String[] args) {
	int nPerPage=7;
	Scanner scanner = new Scanner(System.in);
	int 결과;
	while(true){
	System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰시오.)");
	 String inputString = scanner.nextLine();
	 
	 if(inputString.equals("exit") ) {
	 System.out.println("끝");
	 break;
	}
	 int result = Integer.parseInt(inputString); //int로 바꾸기 
	 결과 = result / nPerPage;
	if(result%nPerPage !=0) {
		결과 = result / nPerPage+1;
	}
	
	
	System.out.println(결과+"페이지가 필요합니다.");
	}
}
}
