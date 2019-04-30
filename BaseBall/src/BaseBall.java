import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	//정답 만들자
	// 1~5까지 랜덤숫자 3번 뽑자, 단 중복없이
	String c ="416";
	//무한반복
	while(1) {
	//1~9까지 세자리 숫자 입력하자
	String p = scanner.nextLine();
	// strike, ball 구하자
	boolean isEnd = play(p, c);
	//strike ==입력한 문자를 길이만큼 나오면, HIT
	if(isEnd == true) {
		System.out.println("HIT");
		break;
		}
	}
	}
	private static boolean play(String p, String c){
		int strike = 0;
		int ball = 0;
	//   for i 사용 인덱스 들고
		for(int i=0; i<p.length();i++) {
		//     for j 컴퓨터인덱스 돌고
			for(int j =0 ;j<c.length();j++) {
				if (p.charAt(i) == c.charAt(j)) {
					if(i == j) strike++;
					else ball++;
			}
		}
		}
		// p, strike, ball 출력하자
		System.out.println(p + "\tstrike: "+strike+"\tball: "+ball);
		
		//p와 c가 같을 때, return true;
		if(p.equals(c))
			return true;
		return false;
	}
}
