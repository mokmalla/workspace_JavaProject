import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	//���� ������
	// 1~5���� �������� 3�� ����, �� �ߺ�����
	String c ="416";
	//���ѹݺ�
	while(true) {
	//1~9���� ���ڸ� ���� �Է�����
	String p = scanner.nextLine();
	// strike, ball ������
	boolean isEnd = play(p, c);
	//strike ==�Է��� ���ڸ� ���̸�ŭ ������, HIT
	if(isEnd == true) {
		System.out.println("HIT");
		break;
		}
	}
	}
	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		//1~9 ��������
		Random random = new Random();
		for(int i =0; i<3; i++) {
			int r = random.nextInt(9-1+1)+1;
			String rString = String.valueOf(r);
			//StringBuffer�� �ֱ�����, �ִ��� Ȯ������
			if(buffer.toString().contains(rString)) {
			buffer.append(rString);
			i++;
			}
		}
		return "719";
	}
	private static boolean play(String p, String c){
		int strike = 0;
		int ball = 0;
	//   for i ��� �ε��� ���
		for(int i=0; i<p.length();i++) {
		//     for j ��ǻ���ε��� ����
			for(int j =0 ;j<c.length();j++) {
				if (p.charAt(i) == c.charAt(j)) {
					if(i == j) strike++;
					else ball++;
			}
		}
		}
		// p, strike, ball �������
		System.out.println(p + "\tstrike: "+strike+"\tball: "+ball);
		
		//p�� c�� ���� ��, return true;
		if(p.equals(c))
			return true;
		return false;
	}
}
