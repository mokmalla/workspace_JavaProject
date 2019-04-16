import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {
		String[] pae = {"가위","바위","보"};
		while(true) {
			System.out.println("사용자 입력을 말하자 (1: 가위, 2: 바위, 3: 보)");
		Scanner sc= new Scanner(System.in);
		int p =sc.nextInt();
		if(p==0) 
			 break;
		int c = makeComputer();
		int result = compare(p,c);
		System.out.println("사용자 : "+pae[p-1]+"\t컴퓨터 : "+pae[c-1]);
		if(result==-1)
		System.out.println("짐");
		else if(result ==0)
			System.out.println("비김");
		else
			System.out.println("이김");
	}
	}

	private static int compare(int p, int c) {
		//-1; 사용자가 짐
		//0: 비김
		//1: 사용자가 이김
		int result=0;
		if( (p+1)%3 ==c %3 ) {
			result=1;
		}
		else if(p==c) {
			result=0;
		}
		else{
			result=-1;
		}
	
		return result;
	}

	private static int makeComputer() {
		Random random = new Random();
		int c= random.nextInt(3-1+1)+1;
		return c;
	}
	}

